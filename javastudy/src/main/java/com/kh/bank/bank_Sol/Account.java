package com.kh.bank.bank_Sol;

public class Account {
    // 계좌관리 - 최대치 5개
    private static final int ACCOUNTS_MAX_SIZE = 5;
    private static Account[] accounts = new Account[ACCOUNTS_MAX_SIZE]; // 인스턴스마다 생성X, 공유가 되어야해서 static
    // ------------------------------------------------------------------------------
    private String accountName;         // ★예금주
    private int balance;                // ★잔액
    private String accountNumber;       // ★계좌번호
    // ------------------------------------------------------------------------------
    private static int acountAccNum;       // 계좌번호 카운트, 공유되어야 하니 static
    private static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호 자리 수

    // -------------------------------------------------------------------------------
    // 🎈★계좌 생성 : 생성자
    public Account(String accountName) {
        this.accountName = accountName;

        // 🍀동명이인 찾기
        if (samName(accountName)) {
            System.out.println("[🚨]동일한 예금주가 존재합니다.");
            return;
        }

//        acountAccNum++;
//        accountNumber = makeAcountNumber(acountAccNum); // 🍀계좌번호 생성
        accountNumber = makeAcountNumber(++acountAccNum); // 계좌번호 생성 (위에 두줄 축약)
/*        // 계좌번호 00x .. 0xx 표기
        String str = "" + acountAccNum;
//        int cnt = 3 - str.length(); // 앞에 0 붙을 수 구하기
        int cnt = ACCOUNT_NUM_SIZE - str.length();
        for (int i = 0; i < cnt; i++) {
            str = "0" + str;
        }
        accountNumber = str;      */


        addAcount(); // 🍀계좌 추가
    }

    // 🍀동명이인 찾기
    private boolean samName(String accountName) {
        for (Account ele : accounts) {
            if (ele != null && ele.accountName.equals(accountName)) {
                return true; // 동명이인 발견
            }
        }
        return false; // 동명이인 없음
    }

    // 🍀계좌 추가
    private void addAcount() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = this; // this 현재 만들어진 인스턴스들
                System.out.println("[👍]신규 계좌가 생성 되었습니다.");
                System.out.println(this);
                return;
            }
        }
        System.out.println("[🚨]계좌 개설 한도 초과");
    }

    // 🍀계좌번호 생성
    private String makeAcountNumber(int acountAccNum) {
        // 계좌번호 00x .. 0xx 표기
        String str = "" + acountAccNum;
        int cnt = ACCOUNT_NUM_SIZE - str.length();
        for (int i = 0; i < cnt; i++) {
            str = "0" + str;
        }
        return str;
    }

    // 🍀계좌 검색 (인덱스번호 반환)
    private int findAccount(String accountNumber) {
        int idx = -1;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].accountNumber.equals(accountNumber)) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    // 🎈★폐지
    public void closingAccout(String accountNumber) {
        // 계좌번호로 해당 계좌 찾아오기
        int idx = findAccount(accountNumber);
        if (idx == -1) { // 계좌를 못 찾을 경우 idx는 -1이 반환 되었기 때문에
            System.out.println("[🚨]입력한 계좌를 찾지 못했습니다.");
            return;
        }
        Account account = accounts[idx];
        //잔액이 남아있을 경우
        if (account.balance > 0) {
            System.out.println("[🚨]잔액이 남아있습니다.");
            return;
        }
        // 폐지 처리
        System.out.println("[🔊]" + account.accountName + "님의 계좌가 폐지됩니다.");
        accounts[idx] = null;
        // account = null; 로 하면 account 변수가 null을 가리키게 하지
        // 해당 객체를 배열에서 삭제하는 효과는 없다.
    }


    // 🎈★입금
    public void deposit(String accountNumber, int money) {
        // 입금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("[🚨]입금 한도액 초과(4만원)");
            return;
        }
        // 계좌번호로 해당 계좌 찾아오기 🍀
        int idx = findAccount(accountNumber);
        if (idx == -1) { // 계좌를 못 찾을 경우
            System.out.println("[🚨]입력한 계좌를 찾지 못했습니다.");
            return;
        }
        Account account = accounts[idx];
        // 예치금액은 10만원 이하로 제한 한다.
        if (account.balance + money > 100_000) {
            System.out.println("[🚨]예치금액 초과(10만원)");
            return;
        }
        // 입금처리
        account.balance += money;
        System.out.println("[💰]입금이 완료 되었습니다.");
        System.out.println(account.toString());
    }

    // 🎈★출금
    public void withdrawal(String accountNumber, int money) {
        // 출금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("[🚨]출금 한도액 초과(4만원)");
            return;
        }
        // 계좌번호로 해당 계좌 찾아오기 🍀
        int idx = findAccount(accountNumber);
        if (idx == -1) { // 계좌를 못 찾을 경우
            System.out.println("[🚨]입력한 계좌를 찾지 못했습니다.");
            return;
        }
        Account account = accounts[idx];
        // 예치금액은 10만원 이하로 제한 한다.
        if (account.balance - money < 0) {
            System.out.println("[🚨]잔액이 부족합니다.");
            return;
        }
        // 출금처리
        balance -= money;
        System.out.println("[💰]출금이 완료 되었습니다.");
        System.out.println(account.toString());
    }

    // 🎈★조회(개별)
    public void getAccount(String accountNumber) {
        // 계좌번호로 해당 계좌 찾아오기
        int idx = findAccount(accountNumber);
        if (idx == -1) { // 계좌를 못 찾을 경우
            System.out.println("[🚨]입력한 계좌를 찾지 못했습니다.");
            return;
        }
        Account account = accounts[idx];
//        System.out.print("계좌번호 : " + account.accountNumber);
//        System.out.print("\t예금주명: " + account.accountName);
//        System.out.print("\t잔액 : " + account.balance);
//        System.out.println();
        System.out.println(account.toString());
    }

    // 🎈★조회(전체)
    public void listAccount() {
        int usingAccount = 0; // 사용중인 계좌
        for (Account ele : accounts) {
            if (ele == null) {
                continue;
            }

            System.out.print("계좌번호 : " + ele.accountNumber);
            System.out.print("\t예금주명: " + ele.accountName);
            System.out.print("\t잔액 : " + ele.balance);
            System.out.println();
            usingAccount++; // accounts[i] != null이면 카운트

        }
        System.out.println("- 사용중인 계좌수 : " + usingAccount);
        System.out.println("- 잔여 계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
    }

    @Override
    public String toString() {
        return "계좌번호 : " + accountNumber +
                "\t예금주명 : " + accountName +
                "\t잔액 : " + balance + "\n";
    }
}
