package com.kh.bank;

public class Account {
    private String name; // ★속성 : 예금주 이름
    private int balance; // ★속성 : 잔고
    private String accNum; // ★속성 : 계좌번호
    public static int acc = 0; // 계좌 갯수 확인

    // ★생성자 : 계좌는 예금주 이름을 입력받아 생성
    public Account(String name) {
        this.name = name;
        balance = 0;
        acc++; // 객체 생성시 계좌 갯수 1++
    }

    // ★기능 : 입금
    public void moneyIn(int money) {
        // 4만원 초과 입금시 입금 실패
        if (money >= 40_000) {
            System.out.println("[실패]입금 한도액 4만원을 초과할 수 없습니다.");
            System.out.println();
            return; // 메소드 종료
        }
        // 잔액이 10만원 넘을 시 입금 실패
        if (balance + money > 100_000) {
            System.out.println("[실패]총 계좌 금액은 10만원을 넘길 수 없습니다.");
            System.out.println();
            return;
        }
        // 분기문을 거치고 성공
        System.out.println("[성공] " + money + "원이 입금 되었습니다.");
        balance += money; // balance = balance + money 잔액에 입력한 금액을 더함
        System.out.println(name + "님 총 계좌 잔액 : " + balance);
        System.out.println();
    }

    // ★기능 : 출금
    public void moneyOut(int money) {
        // 4만원 초과 출금시 입금 실패
        if (money >= 40_000) {
            System.out.println("[실패]입금 한도액 4만원을 초과할 수 없습니다.");
            System.out.println();
            return; // 메소드 종료
        }
        if (balance - money < 0) {
            System.out.println("[실패]잔액이 부족합니다.");
            System.out.println();
            return;
        }
        // 분기문을 거치고 성공
        System.out.println("[성공] " + money + "원이 출금 되었습니다.");
        balance -= money; // 잔액에 입력한 금액을 뺌
        System.out.println(name + "님 총 계좌 잔액 : " + balance);
        System.out.println();
    }

    // ★기능 : 조회
    public void list() {
        System.out.println("---- 조회된 계좌 번호 [" + accNum + "] ----");
        System.out.print("예금주 : " + name);
        System.out.println("\t|\t잔고 : " + balance);
        System.out.println("------------------------------");
        System.out.println();
    }

    // 예금주 중복 비교를 위해 getName() 메소드 생성
    public String getName() {
        return name;
    }

    // 계좌 찾기위해 getAccNum() 메소드 생성
    public String getAccNum() {
        return accNum;
    }

    // 예금주에 계좌번호 넣을 때 필요
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    // 현재 잔고를 알기 위해서 getBalance() 메소드 생성
    public int getBalance() {
        return balance;
    }

    // 사용 중인 계좌 수
    @Override
    public String toString() {
        String result = "";
        result += "예금주 : " + name;
        result += "\t|\t잔고 : " + balance;
        return result;
    }
}
