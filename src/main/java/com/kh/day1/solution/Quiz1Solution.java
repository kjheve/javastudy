package com.kh.day1.solution;

import java.util.Scanner;

public class Quiz1Solution {
    public static void main(String[] args) {
        // 1) 콘솔 입력
        Scanner scanner = new Scanner(System.in); // Scanner 참조형
                                                  // scanner 변수
        System.out.print("정수 입력 : ");
        // case1)
        int num = scanner.nextInt(); // 콘솔에서 정수를 입력 받는다
        // case2)
//        int num = Integer.valueOf(scanner.nextLine());
//        String input = scanner.nextLine(); // 문자열을 콘솔로부터 입력 받는다.
//        double number2 = scanner.nextDouble(); // 콘솔에서 실수를 입력 받는다
//        boolean flag = scanner.nextBoolean(); // 콘솔에서 논리값을 입력 받는다


        // 2) 짝홀수 판단
        if (num % 2 == 0) {
            System.out.println(num + "는 짝수 입니다.");
        } else {
            System.out.println(num + "는 홀수 입니다.");
        }

        // 연산자 순서 : 산술 > 비교 > 대입
        // boolean result = num % 2 == 0;
    }
}
