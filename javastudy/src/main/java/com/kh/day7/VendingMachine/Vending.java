package com.kh.day7.VendingMachine;

import java.util.Scanner;
public class Vending {
    //속성
    int balance;    //잔액
    String[] drinks = {"콜라", "사이다", "커피"};  //메뉴
    int[] prices = {1000, 800, 1500};   //가격

    //행위
    void run(){
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        while (!stop) {

            while (true) {
                System.out.println("현재잔액 : " + balance);
                System.out.print("투입액[0-종료] : ");
                int money = scanner.nextInt();
                balance += money;
                //
                if(money == 0) {
                    stop = true;
                    break;
                }
                // 잔액 최소 가격 메뉴보다 큰경우 다음으로 진행.
                if (balance >= minPrice(prices)) {
                    break;
                }
            }
            if(stop) break;

            int menu = -1;
            do {
                System.out.println("메뉴 : 1.콜라 2.사이다 3.커피");
                System.out.print("선택 >> ");
                menu = scanner.nextInt();
                if(menu >=1 && menu <=3){
                    break;
                }
            } while (true);

            String selectedDrink = drinks[menu-1];  // 선택한 음료
            int priceOfDrink = prices[menu-1];      // 선택한 음료 가격

            if(balance >= priceOfDrink){
                System.out.println(selectedDrink + "를 선택했습니다.");
                balance -= priceOfDrink;
                System.out.println("거스름돈 : " + balance);
                balance = 0;
            }else{
                System.out.println("잔액이 부족합니다." + selectedDrink + "은 " + priceOfDrink + "원 입니다.");
            }
        }
    }

    //최소 가격 구하기
    private int minPrice(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
            }
        }
        return min;
    }
}