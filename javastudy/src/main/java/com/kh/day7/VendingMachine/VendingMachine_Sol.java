package com.kh.day7.VendingMachine;
// 돈 투입시 에러발생 ! 문제점을 찾아라..
// 찾음! minPrice() 사용시 길이를 prices[i]로 둬버림...

import java.util.Scanner;

public class VendingMachine_Sol {
    // ----- 속성
    int balance; // 잔액
    String[] drinks = {"콜라", "사이다", "커피"}; // 메뉴
    int[] prices = {1000, 800, 1500}; // 가격

    // ----- 행위
    void run() {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        while (!stop) {

            while (true) {
                System.out.println("현재잔액 : " + balance);
                System.out.print("투입액[0-종료] : ");
                int money = scanner.nextInt();
                balance += money;

                if (money == 0) {
                    stop = true;
                    break;
                }

                if (balance >= minPrice(prices)) { // 최소가격보다 크면 while문 탈출
                    break;
                }
            } // while문 종료

            if (stop) {
                break;
            }

            int menu = -1;
            do {
                System.out.println("메뉴 : 1. 콜라 2. 사이다 3. 커피");
                System.out.println("가격 :  1000     800      1500");
                System.out.print("선택 >> ");
                menu = scanner.nextInt();
                if (menu >= 1 && menu <= 3) {
                    break;
                }
            } while (true);

            String selectedDrink = drinks[menu - 1]; // 선택한 음료
            int priceOfDrink = prices[menu - 1]; // 선택한 음료 가격

            if (balance >= priceOfDrink) {
                System.out.println(selectedDrink + "를 선택했습니다.");
                balance -= priceOfDrink;
                System.out.println("거스름돈 : " + balance);
                balance = 0;
            } else {
                System.out.println("잔액이 부족합니다 " + selectedDrink + "은 " + priceOfDrink +"입니다.");
            }
        }
    }

    // 최소가격을 찾는 메소드
    private int minPrice(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return min;
    }
}
