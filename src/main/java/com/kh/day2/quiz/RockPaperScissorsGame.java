package com.kh.day2.quiz;

import java.util.Random;
import java.util.Scanner;

/*
    가위바위보 게임 구현하기
    ---------------------------------
    메뉴 : 1. 가위 2. 바위 3. 보 4. 종료
    ---------------------------------
    참여자 : 3. 보 선택
    컴퓨터 : 주먹 (랜덤)
    참여자 : 보
    참여자 승!!

    ---------------------------------
    메뉴 : 1. 가위 2. 바위 3. 보 4. 종료
    ---------------------------------
    참여자 : 4
     게임종료합니다!!
 */

// 4. 누를 때 까지 종료하는것을 구현 안함...
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        // 1. 메뉴화면 표시
        menu();

        // 2. 사용자 가위바위보 선택
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // 3. 컴퓨터 가위바위보 랜덤 선택
        Random random = new Random();
        int computer = random.nextInt(4) + 1; // 1, 2, 3 정수 랜덤 생성

        // 4. 결과출력
        switch (user) {
            case 1:
                if (computer == 1) {
                    System.out.println("컴퓨터 : 가위 / 참여자 : 가위");
                    System.out.println("결과 : 무승부!!");
                } else if (computer == 2) {
                    System.out.println("컴퓨터 : 바위 / 참여자 : 가위");
                    System.out.println("결과 : 컴퓨터 승!!");
                } else {
                    System.out.println("컴퓨터 : 보 / 참여자 : 가위");
                    System.out.println("결과 : 참여자 승!!");
                }
                break;
            case 2:
                if (computer == 1) {
                    System.out.println("컴퓨터 : 가위 / 참여자 : 바위");
                    System.out.println("결과 : 참여자 승!!");
                } else if (computer == 2) {
                    System.out.println("컴퓨터 : 바위 / 참여자 : 바위");
                    System.out.println("결과 : 무승부!!");
                } else {
                    System.out.println("컴퓨터 : 보 / 참여자 : 바위");
                    System.out.println("결과 : 컴퓨터 승!!");
                }
                break;
            case 3:
                if (computer == 1) {
                    System.out.println("컴퓨터 : 가위 / 참여자 : 보");
                    System.out.println("결과 : 컴퓨터 승!!");
                } else if (computer == 2) {
                    System.out.println("컴퓨터 : 바위 / 참여자 : 보");
                    System.out.println("결과 : 참여자 승!!");
                } else {
                    System.out.println("컴퓨터 : 보 / 참여자 : 보");
                    System.out.println("결과 : 무승부!!");
                }
                break;
            default:
                menu();
                System.out.println(user);
                System.out.println("게임 종료 합니다!!");
        }
    }

    public static void menu() {
        System.out.println("------------------------------");
        System.out.println("메뉴 : 1.가위 2.바위 3.보 4.종료");
        System.out.println("------------------------------");
        System.out.print("참여자 선택 : ");
    }
}
