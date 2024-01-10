package com.kh.bank.bank_Sol;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false; // while 반복문 flag
        Account account = null; // Account 객체 생성한거 넣을 변수
        String accountName; // 예금주명 입력받을 변수
        String accountNumber; // 계좌번호 입력받을 변수
        int money; // 입금액 입력받을 변수

        while (!stop) {
            System.out.println("[1]신규 / [2]폐지 / [3]입금 / [4]출금");
            System.out.println("[5]개별조회 / [6]전체조회 / [7]종료");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(scanner.nextLine()); // 메뉴 입력 받기

            switch (menu) {
                case 1: // 🎈신규
                    System.out.println("= 신규 계좌생성 =");
                    System.out.print("예금주명 >> ");
                    accountName = scanner.nextLine();
                    account = new Account(accountName);
                    break;
                case 2: // 🎈폐지
                    System.out.println("= 계좌 폐지 =");
                    System.out.print("폐지할 계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    account.closingAccout(accountNumber);
                    break;
                case 3: // 🎈입금
                    System.out.println("= 계좌 입금 =");
                    System.out.print("(1/2)계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    System.out.print("(2/2)입금액 >> ");
                    money = Integer.parseInt(scanner.nextLine());
                    account.deposit(accountNumber, money);
                    break;
                case 4: // 🎈출금
                    System.out.println("= 계좌 출금 =");
                    System.out.print("(1/2)계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    System.out.print("(2/2)출금액 >> ");
                    money = Integer.parseInt(scanner.nextLine());
                    account.withdrawal(accountNumber, money);
                    break;
                case 5: // 🎈계좌조회(개별)
                    System.out.println("= 개별 조회 =");
                    System.out.print("계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    account.getAccount(accountNumber);
                    break;
                case 6: // 🎈계좌조회(전체)
                    System.out.println("= 전체 조회 =");
                    account.listAccount();
                    break;
                case 7: // 종료
                    stop = true;
                    break;
                default: // 기타
                    System.out.println("[🚨]잘못된 숫자 입력");
                    
            }


        } // while 종료
        System.out.println("시스템 종료");
    } // main 종료
} // AccountMain 종료
