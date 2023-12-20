package com.kh.day1.quiz;

import java.util.Scanner;

/*
    콘솔로부터 2개의 정수를 입력받아
    두 정수중 큰값을 출력하기
 */
public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 두 번 입력하시오");
        System.out.print("첫번째 숫자 : ");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.print("두번째 숫자 : ");
        int b = Integer.valueOf(scanner.nextLine());

        if (a > b) {
            System.out.println(a + " 이(가) " + b + " 보다 더 큽니다.");
        } else {
            System.out.println(b + " 이(가) " + a + " 보다 더 큽니다.");
        }
    }
}
