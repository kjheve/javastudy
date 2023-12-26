package com.kh.day5;

import java.util.Scanner;

public class Question1_Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; // 잔액
        boolean run = true;

        while (run) {
            boolean stop_depositAmount = false, stop_widthrawAmount = false;
            System.out.println("---------------------------------------");
            System.out.println("메뉴 : 1. 입금 2. 출금 3. 잔액조회 0. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택 : ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1: // 입금
                    while (!stop_depositAmount) {
                        System.out.print("입금액[0-상위메뉴 이동] : ");
                        int depositAmout = scanner.nextInt();
                        // 0 입력시 상위메뉴 입력
                        if (depositAmout == 0) {
                            stop_depositAmount = true;
                            continue; // continue 없으면 입금처리까지 표기됨
                        }
                        // 체크. 음수 체크
                        if (depositAmout < 0) {
                            System.out.println("입금액이 잘못 되었습니다.");
                            continue;
                        }
                        // 체크1. 계좌에 최대 10만원까지 입금 가능
                        if (balance + depositAmout > 100_000) {
                            System.out.println("구좌에 최대 10만원까지 입금 가능합니다. 잔액 : " + balance);
                            continue;
                        }
                        // 체크2. 1000원 미만으로 입출금 불가
                        if (depositAmout % 1000 != 0) {
                            System.out.println("1000원 미만으로 입금 불가");
                            continue;
                        }
                        // 입금처리
                        balance += depositAmout;
                        System.out.println(depositAmout + "원이 입금되었습니다. 잔액 : " + balance);
                        stop_depositAmount = true; // or break;
                    }
                    break;
                case 2: // 출금
                    while (!stop_widthrawAmount) {
                        System.out.print("출금액[0-상위메뉴 이동] : ");
                        int widthrawAmount = scanner.nextInt();
                        // 0 입력시 상위메뉴 입력
                        if (widthrawAmount == 0) {
                            stop_widthrawAmount = true;
                            continue; // continue 없으면 입금처리까지 표기됨
                        }
                        // 체크. 음수체크
                        if (widthrawAmount < 0) {
                            System.out.println("출금액이 잘못 되었습니다.");
                            continue;
                        }
                        // 체크2. 잔액체크 : 출금액이 더 많으면 출금 불가.
                        if (widthrawAmount > balance) {
                            System.out.println("잔액이 부족합니다. 잔액 : " + balance);
                            continue;
                        }
                        // 체크3. 1000원 미만으로 입출금 불가
                        if (widthrawAmount % 1000 != 0) {
                            System.out.println("1000원 미만으로 출금 불가");
                            continue;
                        }

                        // 출금 처리
                        balance -= widthrawAmount;
                        System.out.println(widthrawAmount + "원이 출금되었습니다. 잔액 : " + balance);
                        stop_widthrawAmount = true;
                    }
                    break;
                case 3: // 잔액
                    System.out.println("잔액 : " + balance);
                    break;
                case 0: // 종료
                    run = false;
                    break;
                default:
                    System.out.println("메뉴에있는 숫자 입력바람");
            }

        } //while 종료
        System.out.println("프로그램 종료");
    }
}