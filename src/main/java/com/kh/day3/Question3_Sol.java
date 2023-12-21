package com.kh.day3;


import java.util.Random;
import java.util.Scanner;

public class Question3_Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1;

        boolean stop = false;
        int cnt = 3; // 틀린 횟수

        System.out.println("(1~10) 숫자를 맞춰보세요 : ");
        while (!stop) {
            System.out.print("숫자 : ");
            int answer = sc.nextInt();

            if (number == answer) {
                System.out.println("=> 빙고! <=");
                stop = true;
            } else {
                cnt--;
                System.out.println("틀렸습니다.");
                System.out.println((number > answer) ? "크다" : "작다");
                if (cnt == 0) {
                    stop = true; // or break;
                    System.out.println("=> 패배! <=");
                }
            }
        }
    }
}
