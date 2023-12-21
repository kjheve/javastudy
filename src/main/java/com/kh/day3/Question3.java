package com.kh.day3;

/*
    숫자 맞추기 게임
    1~10까지의 임의의 정수값 맞추기
    제약조건 : 3번의 기회가 주어짐.

    번호 : 5
    작다
    번호 : 3
    작다
    번호 : 2
    빙고!
 */

import java.util.Random;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int game = random.nextInt(10) + 1;
        int chance, player;

        menu();

        for (chance = 2; chance >= 0; chance--) {
            player = scanner.nextInt();

            if (player == game) {
                System.out.println("빙고!");
                break; // for문 종료
            } else if (player < game) {
                System.out.println("크다");
            } else { // (palyer > game)
                System.out.println("작다");
            }
            if (chance == 0) {
                System.out.println("패배!");
            }
        }
    }
    public static void menu() {
        System.out.println("숫자맞추기 게임");
        System.out.print("숫자를 입력하시오 : ");
    }
}
