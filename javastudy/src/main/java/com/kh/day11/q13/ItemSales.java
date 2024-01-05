package com.kh.day11.q13;

public class ItemSales {
   private int numberSold; // 총 판매 수량
   private double sales; // 총 판매금액
   private double discounts; // 총 할인금액
   private int itemCost; // 판매 가격
   private int bulkMin; // 대량 판매 수량
   private double bulkDiscount; // 대량 판매 할인율

   // 생성자
   public ItemSales(int itemCost, int bulkMin, double bulkDiscount) {
      this.itemCost = itemCost;
      this.bulkMin = bulkMin;
      this.bulkDiscount = bulkDiscount;
//      this.numberSold = 0;
//      this.sales = 0.0;
//      this.discounts = 0.0;
   }

   public int getNumberSold() {
      return numberSold;
   }

   public void setNumberSold(int numberSold) {
      this.numberSold = numberSold;
   }

   public double getSales() {
      return sales;
   }

   public void setSales(int sales) {
      this.sales = sales;
   }

   public double getDiscounts() {
      return discounts;
   }

   public void setDiscounts(int discounts) {
      this.discounts = discounts;
   }

   public int getItemCost() {
      return itemCost;
   }

   public void setItemCost(int itemCost) {
      this.itemCost = itemCost;
   }

   public int getBulkMin() {
      return bulkMin;
   }

   public void setBulkMin(int bulkMin) {
      this.bulkMin = bulkMin;
   }

   public double getBulkDiscount() {
      return bulkDiscount;
   }

   public void setBulkDiscount(int bulkDiscount) {
      this.bulkDiscount = bulkDiscount;
   }

   // 물품의 누적 판매 정보
   public void displaySales() {
      System.out.println("누적 판매 수량 : " + numberSold);
      System.out.println("누적 판매 금액 : " + sales);
      System.out.println("누적 할인 금액 : " + discounts);
   }
   public void registerSale(int n) { // (n > 0)
      // 한 판매의 기본 판매 금액 계산
      double basicCost = n * itemCost;

      // 할인 금액 초기화
      double discountGiven = 0.0;

      // 총 판매 수량
      numberSold += n;

      // (판매 수량 >= 대량 판매 수량) 이면 할인 금액을 계산
      if (numberSold >= bulkMin) {
         discountGiven = basicCost * bulkDiscount; // ?
      }

      // 총 판매금액 += (기본 판매 금액 - 할인 금액)
      sales += (basicCost - discountGiven);
      discounts += discountGiven;
   }

}

