package com.kh.bank.bank_Sol_refactoring2;

import java.util.Scanner;

public class AccountMain {

    // 계좌관리 - 최대치 5개
    static final int ACCOUNTS_MAX_SIZE = 5;
    static Account[] accounts = new Account[ACCOUNTS_MAX_SIZE]; // 인스턴스마다 생성X, 공유가 되어야해서 static

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false; // while 반복문 flag
        Account account = null; // Account 객체 생성한거 넣을 변수
        String accountName; // 예금주명 입력받을 변수
        String accountNumber; // 계좌번호 입력받을 변수
        int money; // 입금액 입력받을 변수
        int idx = -1; // 계좌 인덱스

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
                    // 🍀동명이인 찾기
                    if (samName(accountName)) {
                        System.out.println("[🚨]동일한 예금주가 존재합니다.");
                        break;
                    }
                    account = new Account(accountName);
                    addAcount(account);
                    break;
                case 2: // 🎈폐지
                    System.out.println("= 계좌 폐지 =");
                    System.out.print("폐지할 계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    closingAccout(accountNumber);
                    break;
                case 3: // 🎈입금
                    System.out.println("= 계좌 입금 =");
                    System.out.print("(1/2)계좌번호 >> ");
                    accountNumber = scanner.nextLine();

                    idx = findAccountIdx(accountNumber);
                    if (idx == -1) continue;

                    System.out.print("(2/2)입금액 >> ");
                    money = Integer.parseInt(scanner.nextLine());
                    accounts[idx].deposit(money);
                    break;
                case 4: // 🎈출금
                    System.out.println("= 계좌 출금 =");
                    System.out.print("(1/2)계좌번호 >> ");
                    accountNumber = scanner.nextLine();

                    idx = findAccountIdx(accountNumber);
                    if (idx == -1) continue;

                    System.out.print("(2/2)출금액 >> ");
                    money = Integer.parseInt(scanner.nextLine());
                    accounts[idx].withdrawal(money);
                    break;
                case 5: // 🎈계좌조회(개별)
                    System.out.println("= 개별 조회 =");
                    System.out.print("계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    getAccount(accountNumber);
                    break;
                case 6: // 🎈계좌조회(전체)
                    System.out.println("= 전체 조회 =");
                    listAccount();
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

    // 🍀동명이인 찾기
    private static boolean samName(String accountName) {
        for (Account ele : accounts) {
            if (ele != null && ele.getAccountName().equals(accountName)) {
                return true; // 동명이인 발견
            }
        }
        return false; // 동명이인 없음
    }


    // 🍀계좌 추가
    private static void addAcount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account; // this 현재 만들어진 인스턴스들
                System.out.println("[👍]신규 계좌가 생성 되었습니다.");
                System.out.println(account.toString());
                return;
            }
        }
        System.out.println("[🚨]계좌 개설 한도 초과");
    }

    // 🎈★폐지
    private static void closingAccout(String accountNumber) {
        // 계좌번호로 해당 계좌 찾아오기 🍀
        Account account = findAccount(accountNumber);
        if (account == null) { // 계좌를 못 찾을 경우 account는 null이 반환 되었기 때문에
            return;
        }

        //잔액이 남아있을 경우
        if (account.getBalance() > 0) {
            System.out.println("[🚨]잔액이 남은 계좌는 폐지가 불가능.");
            return;
        }

        // 폐지 처리
        System.out.println("[🔊]" + account.getAccountName() + "님의 계좌가 폐지됩니다.");
        // account = null; 로 하면 account 변수가 null을 가리키게 하지
        // 해당 객체를 배열에서 삭제하는 효과는 없다.
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].equals(account)) {
                accounts[i] = null;
                break;
            }
        }
    }

    // 🍀계좌 검색 (Account로 반환)
    private static Account findAccount(String accountNumber) {
        Account account = null;
        int idx = -1;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
                account = accounts[i];
                return account;
            }
        }
        System.out.println("[🚨]입력한 계좌를 찾지 못했습니다.");
        return account; // 못찾았으면 null을 반환
    }

    // 🍀계좌 검색 (Index로 반환)
    private static int findAccountIdx(String accountNumber) {
        int idx = -1;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (accounts[i].getAccountNumber().equals(accountNumber)) {
                    idx = i;
                    return idx;
                }
            }
        }
        System.out.println("[🚨]입력한 계좌를 찾지 못했습니다.");
        return idx;
    }

    // 🎈★조회(개별)
    public static void getAccount(String accountNumber) {
        // 계좌번호로 해당 계좌 찾아오기
        Account account = findAccount(accountNumber);
        if (account == null) { // 계좌를 못 찾을 경우 account는 null이 반환 되었기 때문에
            return;
        }
        System.out.print("계좌번호 : " + account.getAccountNumber());
        System.out.print("\t예금주명: " + account.getAccountName());
        System.out.print("\t잔액 : " + account.getBalance());
        System.out.println();
        System.out.println(account.toString());
    }

    // 🎈★조회(전체)
    public static void listAccount() {
        int usingAccount = 0; // 사용중인 계좌
        for (Account ele : accounts) {
            if (ele == null) {
                continue;
            }

            System.out.print("계좌번호 : " + ele.getAccountNumber());
            System.out.print("\t예금주명: " + ele.getAccountName());
            System.out.print("\t잔액 : " + ele.getBalance());
            System.out.println();
            usingAccount++; // accounts[i] != null이면 카운트

        }
        System.out.println("- 사용중인 계좌수 : " + usingAccount);
        System.out.println("- 잔여 계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
    }

} // AccountMain 종료
