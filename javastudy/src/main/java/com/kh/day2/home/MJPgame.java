package com.kh.day2.home;

import java.util.Random;
import java.util.Scanner;

public class MJPgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 받기 만들기
        Random random = new Random(); // 랜덤 생성 만들기

        int player, com;
        boolean stop = true;

        while (stop) { // while(true) = false가 될 때까지 무한루프
            menu();
            player = Integer.parseInt(scanner.nextLine()); // 입력받은 수, 변수 player에 저장
            com = random.nextInt(3) + 1; // 랜덤생성한 수, 변수 com에 저장

            // 플레이어와 컴퓨터 변수에 문자열 넣기
            String playerTextLine = "";
            String comTextLine = "";
            switch (player) {
                case 1:
                    playerTextLine = "묵👊";
                    break;
                case 2:
                    playerTextLine = "찌✌️";
                    break;
                case 3:
                    playerTextLine = "빠🤚";
                    break;
                case 4:
                    stop = false;
                    break;
                default:
                    System.out.println("=]:> 🚨삐빅🚨 <:[=");
                    System.out.println("1, 2, 3, 4 중에 입력하시고 엔터");
            }
            switch (com) {
                case 1:
                    comTextLine = "묵👊";
                    break;
                case 2:
                    comTextLine = "찌✌️";
                    break;
                case 3:
                    comTextLine = "빠🤚";
                    break;
            }

            // 결과 출력
            System.out.println(" ");
            if (player <= 3) {
                System.out.println("당신 : " + playerTextLine);
                System.out.println("컴퓨터 : " + comTextLine);
            }

            // 결과 출력 및 비교
            if (playerTextLine.equals(comTextLine)) {
                System.out.println("결과: Draw");
            } else if (playerTextLine.equals("묵👊")) {
                if (comTextLine.equals("찌✌️")) {
                    System.out.println("결과 : Player Win");
                } else {
                    System.out.println("결과 : Computer Win");
                }
            } else if (playerTextLine.equals("찌✌️")) {
                if (comTextLine.equals("빠🤚")) {
                    System.out.println("결과 : Player Win");
                } else {
                    System.out.println("결과 : Computer Win");
                }
            } else if (playerTextLine.equals("빠🤚")) {
                if (comTextLine.equals("묵👊")) {
                    System.out.println("결과 : Player Win");
                } else {
                    System.out.println("결과 : Computer Win");
                }
            }
            System.out.println(" ");
        }
        System.out.println("게임을 종료 합니다~ ㅅㄱ염");
    }

    public static void menu() {
        System.out.println("━━━━━━━━━━━━묵찌빠 게임━━━━━━━━━━━━");
        System.out.println("┃ 숫자를 입력하시고 엔터를 눌려주세요 ┃");
        System.out.println("┃   1=묵 / 2=찌 / 3=빠 / 4=종료   ┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("당신의 선택 : ");
    }
}