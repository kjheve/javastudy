package com.kh.bank.bank_Sol_refactoring3;

public class Account {

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

        accountNumber = makeAcountNumber(++acountAccNum); // 🍀계좌번호 생성 (위에 두줄 축약)
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

    // 🎈★입금
    public void deposit(int money) {
        // 입금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("[🚨]입금 한도액 초과(4만원)");
            return;
        }

        // 예치금액은 10만원 이하로 제한 한다.
        if (balance + money > 100_000) {
            System.out.println("[🚨]예치금액 초과(10만원)");
            return;
        }
        // 입금처리
        balance += money;
        System.out.println("[💰]입금이 완료 되었습니다.");
        System.out.println(this.toString());
    }

    // 🎈★출금
    public void withdrawal(int money) {
        // 출금한도는 4만원을 초과할 수 없다.
        if (money > 40_000) {
            System.out.println("[🚨]출금 한도액 초과(4만원)");
            return;
        }

        // 예치금액은 10만원 이하로 제한 한다.
        if (balance - money < 0) {
            System.out.println("[🚨]잔액이 부족합니다.");
            return;
        }
        // 출금처리
        balance -= money;
        System.out.println("[💰]출금이 완료 되었습니다.");
        System.out.println(this.toString());
    }



    @Override
    public String toString() {
        return "계좌번호 : " + accountNumber +
                "\t예금주명 : " + accountName +
                "\t잔액 : " + balance + "\n";
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Account(int balance) {
        this.balance = balance;
    }
}
