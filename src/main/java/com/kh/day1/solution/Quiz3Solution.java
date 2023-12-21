package com.kh.day1.solution;

import java.util.Scanner;

public class Quiz3Solution {
    public static void main(String[] args) {
        // 1) 콘솔로부터 정수 4개 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int num2 = scanner.nextInt();
        System.out.print("세번째 정수 입력 : ");
        int num3 = scanner.nextInt();
        System.out.print("네번째 정수 입력 : ");
        int num4 = scanner.nextInt();

        // 2) 정수 4개 중 큰 값 출력하기
        int max = num1;
        if(max < num2) {
            max = num2;
        }
        if(max < num3) {
            max = num3;
        }
        if(max < num4) {
            max = num4;
        }
        System.out.println("max = " + max);
    }
}
