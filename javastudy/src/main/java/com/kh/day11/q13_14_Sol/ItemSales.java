package com.kh.day11.q13_14_Sol;

public class ItemSales {
    private double numberSold; // 총 판매 수량
    private double sales; // 총 판매금액
    private double discounts; // 총 할인금액
    private double itemCost; // 판매 가격 (판매금액)
    private double bulkMin; // 대량 판매 수량
    private double bulkDiscount; // 대량 판매 할인율 ex) 30% -> 30

    // 생성자 : 물품의 판매금액, 대량 판매 수량과 대량 판매 할인율을 각각 주어진 값으로 초기화하면서 객체를 생성한다
    public ItemSales(double itemCost, double bulkMin, double bulkDiscount) {
        this.itemCost = itemCost;
        this.bulkMin = bulkMin;
        this.bulkDiscount = bulkDiscount;
    }

    // 물품의 누적 판매 수량, 누적 판매금액과 누적 할인금액을 출력한다
    public void displaySales() {
        System.out.println("누적 판매 수량 : " + numberSold);
        System.out.println("누적 판매 금액 : " + sales);
        System.out.println("누적 할인 금액 : " + discounts);
    }
    // 물품들의 판매 내역을 기록한다

    /**
     registerSale 메소드 설계
     매개 변수: n (> 0)– 판매당 판매 수량
     변수들
     	basicCost: 판매 금액
     	discountGiven: 할인 금액

     알고리즘
     (1)	한 판매의 기본 판매 금액을 계산한다
     (2)	할인 금액을 0으로 초기화한다
     (3)	총 판매 수량 = 총 판매 수량 + n
     (4)	판매 수량이 대량 판매 수량보다 크거나 같다면 할인 금액을 계산한다
     (5)	총 판매금액에 (기본 판매 금액 – 할인 금액)을 더한다
     (6)	총 할인금액에 할인 금액을 더한다
     */
    public void registerSale(int n) { // n = 판매당 판매수량
        if (!(n > 0)) return;
        double basicCost = n * itemCost; // (1) 한 판매의 기본 판매 금액을 계산
        double discountGiven = 0; // (2) 할인 금액 0으로 초기화
        // (3) 총 판매 수량 = 총 판매수량 + n
        numberSold += n;
        // (4) 판매 수량이 대량 판매 수량보다 크거나 같다면 할인 금액을 계산한다
        if (n >= bulkMin) {
            discountGiven = basicCost * bulkDiscount / 100; // 0.3 대신 30을 입력해도 되게끔
        }
        // (5) 총 판매금액에 (기본 판매 금액 - 할인 금액)을 더한다
        sales += (basicCost - discountGiven);
        // (6) 총 할인금액에 할인 금액을 더한다
        discounts += discountGiven;
    }

    public double getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(double numberSold) {
        this.numberSold = numberSold;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getBulkMin() {
        return bulkMin;
    }

    public void setBulkMin(double bulkMin) {
        this.bulkMin = bulkMin;
    }

    public double getBulkDiscount() {
        return bulkDiscount;
    }

    public void setBulkDiscount(double bulkDiscount) {
        this.bulkDiscount = bulkDiscount;
    }
}
