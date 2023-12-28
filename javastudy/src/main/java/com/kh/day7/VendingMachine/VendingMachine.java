package com.kh.day7.VendingMachine;

import java.util.Scanner;

/*
    음료 자판기 구현하기
    메뉴 : "콜라", "사이다", "커피"
    가격 : 1000,    800   , 1500

    실행결과
    투입액[0-종료] : 2000
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 > 3
    커피를 선택했습니다.
    거스름돈 : 500

    투입액[0-종료] : 500
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 > 3
    잔액이 부족합니다. 커피 : 1500원 입니다.

    case1) 잔액으로 구매상품이 있을경우
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 > 3

    case2) 잔액으로 구매상품이 없는경우
    현재잔액 : 500
    투입액[0-종료] : 0 or 추가잔액

 */
public class VendingMachine {
    // 속성
    int balance; // 잔액
    String[] drinks = {"콜라", "사이다", "커피"}; // 메뉴
    int[] prices = {1000, 800, 1500}; // 가격

    //행위
    void run() {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false, menuStop = false;

        while (!stop) {
            System.out.println("현재잔액 : " + balance);
            System.out.print("투입액[0-종료] : ");
            int money = scanner.nextInt(); // 투입액
            if (money == 0) {
                stop = true;
                continue;
            } else if (money < 0) {
                System.out.println("[경고]음수의 숫자는 투입 불가능");
                continue;
            }
            balance += money;


            if (balance > prices[0]) {
                menu();
            } else if (balance > prices[1]) {
                menu();
            } else if (balance > prices[2]) {
                menu();
            } else {
                continue;
            }

            while (!menuStop) {
                System.out.print("선택 >> ");
                int menu = scanner.nextInt(); // 메뉴선택

                if (menu == 1 || menu == 2 || menu == 3) {
                    String selectedDrink = drinks[menu - 1]; // 선택한 음료
                    int priceOfDrink = prices[menu - 1]; // 선택한 음료의 가격

                    if (balance >= priceOfDrink) { // 투입액이 메뉴의 가격보다 클 경우
                        System.out.println(selectedDrink + "를 선택했습니다.");
                        balance -= priceOfDrink;
        //                System.out.println("거스름돈 : " + balance);
                        menuStop = true;
                    } else {
                        System.out.println("잔액이 부족합니다. " + selectedDrink + "는 " + priceOfDrink + "입니다.");
                        menuStop = true;
                    }
                } else {
                    System.out.println("[경고] 1~3 숫자를 입력 해 주세요");
                }
            }

        } // while 종료
        System.out.println("종료하였습니다, 거스름돈 : " + balance);
    } // run() 종료

    private void menu() {
        System.out.println("메뉴 : 1.콜라 | 2.사이다 | 3.커피");
        System.out.println("가격 :  1000 |   800   |  1500");
    }
}
