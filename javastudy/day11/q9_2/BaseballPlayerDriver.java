package com.kh.day11.q9_2;

import java.util.Scanner;

public class BaseballPlayerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BaseballPlayer[] bp = new BaseballPlayer[9];
        for (int i = 0; i < bp.length; i++) {
            System.out.println("선수의 이름, 위치, 안타수, 4구수를 입력하세요");
            System.out.println("-----" + (i+1) + "번째" + "-----");
            System.out.print("선수 이름 : ");
            String bpname = scanner.nextLine();
            System.out.print("위치 : ");
            String bpposition = scanner.nextLine();
            System.out.print("안타수 : ");
            int noHits = Integer.parseInt(scanner.nextLine());
            System.out.print("4구수 : ");
            int noWalks = Integer.parseInt(scanner.nextLine());
            /*int 변수 = scanner.nextInt(); // 아니면 이렇게 해줘야함
            scanner.nextLine();*/ // "\n" 엔터키 읽기위함

            // 선수 생성
            bp[i] = new BaseballPlayer(bpname);
            bp[i].setPosition(bpposition);
            bp[i].setNumHits(noHits);
            bp[i].setNumWalks(noWalks);
        }

        for (int i = 0; i < bp.length; i++) {
            System.out.println(bp[i].toString());
        }

        // 안타수와 4구수의 합
        int sumhits = 0, sumwalks = 0;
        for (int i = 0; i < bp.length; i++) {
            sumhits += bp[i].getNumHits();
            sumwalks += bp[i].getNumWalks();
        }

        System.out.println("안타수 총합계 : " + sumhits);
        System.out.println("4구수 총합계 : " + sumwalks);
    }
}