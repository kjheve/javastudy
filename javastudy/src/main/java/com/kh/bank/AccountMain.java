package com.kh.bank;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[5]; // 총 개설할 수 있는 계좌 5개

        boolean stop = false; // 메뉴 반복출력 flag
        boolean found; // 계좌 조회 실패시 출력하는 flag
        String accNumber; // 계좌 조회시 입력받을 변수
        int money; // 입금, 출금 입력받을 변수


        while (!stop) {
            // 메뉴구성
            System.out.println("=========== 메뉴 ===========");
            System.out.println("[1]신규 [2]폐지 [3]입금 [4]출금");
            System.out.println("[5]계좌조회(개별) [6]계좌조회(전체)");
            System.out.println("======== [7]종료 ===========");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1: // ★신규 계좌
                    if (Account.acc <= 5) { // 계좌수 5개 확인
                        System.out.println("=]계좌 생성[=");
                        System.out.print("예금주를 입력 해 주세요 : ");
                        String name = scanner.nextLine();

                        // 동명이인 찾기
                        boolean same = false;
                        for (int i = 0; i < Account.acc; i++) {
                            if (accounts[i] != null) { // 배열 null 예외처리
                                if (accounts[i].getName().equals(name)) { // i번째와 입력한 name 비교
                                    System.out.println("[생성실패]동명이인은 계좌개설이 안됩니다");
                                    same = true;
                                    break;
                                }
                            }
                        }
                        
                        if (!same) { // 동명이인 분기에서 !true가 되면 false 이므로 아래 수행 안함
                            
                            // null인 인덱스 찾기
                            int idx = -1;
                            for (int i = 0; i < accounts.length; i++) {
                                if (accounts[i] == null) {
                                    idx = i;
                                    break; // 빈 곳을 찾았으면 반복문 종료
                                }
                            }
                            if (idx != -1) {
                                // 인덱스를 찾았을 때 추가
                                String cntSet = String.format("%03d", idx + 1); // 문자열 00x로 바뀔 코드
                                accounts[idx] = new Account(name); // 예금주 이름을 받아 객체 생성
                                accounts[idx].setAccNum(cntSet); // 문자열 cntSet을 AccNum에 대입
                                System.out.println("[환영]" + accounts[idx].getName() + "님의 계좌가 개설되었습니다.");
                                System.out.println("당신의 계좌번호는 [" + accounts[idx].getAccNum() + "] 입니다 잊지마세요!");
                                System.out.println();
                            } else { // 계좌수 (배열 꽉차면) 5를 넘으면 아래 출력
                                System.out.println("[생성실패] 계좌갯수가 5개를 넘습니다.");
                            }
                        }
                    }
                    break;
                case 2: // ★계좌 폐지
                    System.out.println("=]계좌 폐지[=");
                    System.out.print("계좌번호를 입력 해 주세요 : ");
                    accNumber = scanner.nextLine();

                    found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null && accounts[i].getAccNum().equals(accNumber)) {
                            found = true; // 해당 계좌 번호를 찾았으면 flag를 true로 변경
                            if (accounts[i].getBalance() > 0) { // 잔액이 0보다 크면
                                System.out.println("[실패] 잔액이 남아있습니다.");
                            } else {
                                System.out.println("[완료]계좌번호 " + accounts[i].getAccNum() + "가 폐지됩니다.");
                                System.out.println(accounts[i].getName() + "님 감사했습니다.");
                                accounts[i] = null; // 객체를 가리키는 주소값을 null로 변경
                                Account.acc -= 1; // 계좌폐지시 계좌 갯수 -1
                                System.out.println();
                            }
                        }
                    }
                    if (!found) { // 계좌를 못찾으면 !false 니깐 true가 되어 밑에 문장 실행
                        System.out.println("[실패]계좌번호를 찾을 수 없습니다\n");
                    }
                    break;
                case 3: // ★선택한 계좌 입금
                    System.out.println("=]계좌 입금[=");
                    System.out.print("(1/2)계좌번호를 입력 해 주세요 : ");
                    accNumber = scanner.nextLine();

                    System.out.print("(2/2)입금금액을 입력 해 주세요 : ");
                    money = scanner.nextInt();
                    scanner.nextLine();

                    found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) { // null 예외처리
                            if (accounts[i].getAccNum().equals(accNumber)) { // i번째 계좌와 입력한 계좌 확인
                                found = true;
                                accounts[i].moneyIn(money); // 해당 계좌 입금메소드 호출
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("[실패]계좌번호를 찾을 수 없습니다\n");
                    }
                    break;
                case 4: // ★선택한 계좌 출금
                    System.out.println("=]계좌 출금[=");
                    System.out.print("(1/2)계좌번호를 입력 해 주세요 : ");
                    accNumber = scanner.nextLine();

                    System.out.print("(2/2)출금금액을 입력 해 주세요 : ");
                    money = scanner.nextInt();
                    scanner.nextLine();

                    found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) { // null 예외처리
                            if (accounts[i].getAccNum().equals(accNumber)) { // i번째 계좌와 입력한 계좌 확인
                                found = true;
                                accounts[i].moneyOut(money); // 해당 계좌 출금메소드 호출
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("[실패]계좌번호를 찾을 수 없습니다\n");
                    }
                    break;
                case 5: // ★선택한 계좌 조회
                    System.out.println("=]계좌 조회[=");
                    System.out.print("계좌번호를 입력 해 주세요 : ");
                    accNumber = scanner.nextLine();

                    found = false;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null && accounts[i].getAccNum().equals(accNumber)) {
                            found = true;
                            accounts[i].list(); // 해당 계좌 조회메소드 호출
                        }
                    }
                    if (!found) {
                        System.out.println("[실패]계좌번호를 찾을 수 없습니다\n");
                    }
                    break;
                case 6: // ★전체 계좌조회
                    int tempAcc = 0; // null인 인덱스 갯수 세기
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) {
                            System.out.println(accounts[i]);
                        } else {
                            tempAcc++; // accounts[i] == null 이면 ++
                        }
                    }
                    System.out.println("- 사용중인 계좌 수 : " + Account.acc); // 사용 중인 계좌수 출력
                    System.out.println("- 잔여 계좌 갯수 : " + tempAcc); // null인 인덱스 갯수
                    break;
                case 7: // ★종료
                    stop = true; // 메뉴 반복출력 flag를 false로 만들어 반복문 종료
                    break;
                default:
                    System.out.println("[경고]메뉴에 있는 숫자 입력바람.\n");
            }
        }
        System.out.println("시스템 종료");
    }
}

