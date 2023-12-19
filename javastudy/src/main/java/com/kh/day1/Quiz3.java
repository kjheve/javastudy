package com.kh.day1;

import java.util.Scanner;

/*
    콘솔로부터 3개의 정수를 입력받아 가장 큰 값을 출력하기
    (비교를 해야함)
 */
public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 세 번 입력하시오");
        System.out.print("첫번째 숫자 : ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("두번째 숫자 : ");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.print("세번째 숫자 : ");
        int c = Integer.valueOf(scanner.nextLine());
        
        if (a>b) {
            if (a>c) {
                System.out.println("첫번째 숫자가 제일 큽니다");
            } else {
                System.out.println("세번째 숫자가 제일 큽니다");
            }
        } else if (a<b) {
            if (b>c) {
                System.out.println("두번째 숫자가 제일 큽니다.");
            } else {
                System.out.println("세번째 숫자가 제일 큽니다");
            }
        }
    }
}