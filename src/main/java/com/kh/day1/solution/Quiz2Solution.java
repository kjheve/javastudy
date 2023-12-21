package com.kh.day1.solution;

import java.util.Scanner;

public class Quiz2Solution {
    public static void main(String[] args) {
        // 1) 콘솔로부터 정수 2개 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int num2 = scanner.nextInt();

        // 2) 정수 2개 중 큰값 출력하기
        if(num1 > num2) {
            System.out.println("더 큰값 : " + num1);
        } else if (num1 < num2){
            System.out.println("더 큰값 : " + num2);
        } else {
            System.out.println("결과 : 같다");
        }
    }
}