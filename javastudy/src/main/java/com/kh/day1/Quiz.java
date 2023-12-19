package com.kh.day1;

import java.util.Scanner;

/*
    콘솔로부터 정수를 입력받아
    홀수, 짝수를 출력하는 프로그램을 구현하시오
 */
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력 : ");
        int a = Integer.valueOf(scanner.nextLine());

        if (a%2 == 0) {
            System.out.println("입력하신 숫자는 짝수");
        } else {
            System.out.println("입력하신 숫자는 홀수");
        }
    }
}
