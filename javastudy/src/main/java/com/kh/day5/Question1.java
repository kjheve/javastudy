package com.kh.day5;

import java.util.Scanner;

/*
    ATM기 입출금 구현하기
    제약조건 : 1. 마이너스 통장이 아니다. (잔액이 없을시 출금X)
              2. 계좌에 최대 10만원만 입금 가능
              3. 1000원 미만으로 입출금 불가
              4. 메인메소드 만을 사용하여 구현

    ---------------------------------------
    메뉴 : 1. 입금 2. 출금 3. 잔액조회 0. 종료
    ---------------------------------------
    선택 : 1
    입금액 : 10000
    10000원이 입금되었습니다. 잔액 : 10000
    ---------------------------------------
    메뉴 : 1. 입금 2. 출금 3. 잔액조회 0. 종료
    ---------------------------------------
    선택 : 3
    잔액 : 10000
    -----이하생략----
    선택 : 2
    출금액 : 20000
    잔액이 부족합니다. 잔액 : 10000

 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        int account = 0; // 잔액

        while (!stop) {

            System.out.println("---------------------------------------");
            System.out.println("메뉴 : 1. 입금 2. 출금 3. 잔액조회 0. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택 : ");
            int menu = scanner.nextInt();

            if (menu == 0) { // 0입력시
                stop = true; // 종료
            } else if (menu < 0 || menu > 4) {
                System.out.println("[경과] 메뉴에 있는 숫자를 입력 해 주세요");
            }

            if (menu == 1) {
                System.out.print("입금액 : ");
                int inputAcc = scanner.nextInt();
                if (inputAcc < 1000) {
                    System.out.println("[실패] 천원 이상 입금 바람, 잔액 : " + account);
                } else if (inputAcc + account > 100000) {
                    System.out.println("[실패] 10만원 이상 입금 안됨 .");
                } else {
                    account += inputAcc;
                    System.out.println(inputAcc + "이 입금 되었습니다, 잔액 : " + account);
                }
            } // 메뉴에서 1을 입력했을 때 종료

//            if (menu == 1) {
//                System.out.print("입금액 : ");
//                int inputAcc = scanner.nextInt();
//                account += inputAcc;
//                if (inputAcc >= 1000) { // 입금 성공
//                    System.out.println(inputAcc + "이 입금 되었습니다, 잔액 : " + account);
//                } else if (account > 100000) { // 총 계좌값이 10만원을 넘었을 때
//                    System.out.println("[실패] 잔액이 10만원을 넘었습니다.");
//                    account -= inputAcc; // 입금한 숫자 다시 -
//                    System.out.println("잔액 : " + account);
//                } else { // 1000원 이하로 넣었을 때 실패
//                    System.out.println("[경고] 천원 이상 입금 바람 ");
//                    account -= inputAcc;
//                    System.out.println("잔액 : " + account);
//                }
//            } // 메뉴에서 1을 입력했을 때 종료

            if (menu == 2) {
                if (account == 0) {
                    System.out.println("[경고] 잔액이 0원 입니다. 입금 후 선택하세요");
                } else {
                    System.out.print("출금액 : ");
                    int outputAcc = scanner.nextInt();

                    if (outputAcc < 1000) {
                        System.out.println("[실패] 천원 이상 출금 바람, 잔액 : " + account);
                    } else if (account - outputAcc < 0) {
                        System.out.println("[실패] 잔액이 부족 합니다, 잔액 : " + account);
                    } else {
                        account -= outputAcc;
                        System.out.println(outputAcc + "이 출금 되었습니다, 잔액 : " + account);
                    }
                }
            }
//            if (menu == 2) {
//                System.out.print("출금액 : ");
//                int outputAcc = scanner.nextInt();
//
//                if (outputAcc <= account) {
//                    account -= outputAcc;
//                    System.out.println(outputAcc + "이 출금 되었습니다, 잔액 : " + account);
//                } else {
//                    account -= outputAcc;
//                    if (account < 0) {
//                        System.out.println("[실패] 잔액이 부족 합니다");
//                        account += outputAcc;
//                        System.out.println("잔액 : " + account);
//                    } else {
//                        account += outputAcc;
//                        System.out.println("[실패] 잔액이 부족 합니다");
//                        System.out.println("잔액 : " + account);
//                    }
//                }
//            } // 메뉴에서 2을 입력했을 때 종료

            if (menu == 3) {
                System.out.println("잔액 : " + account);
            }

        }// while 종료
        System.out.println("프로그램 종료");
    }
}