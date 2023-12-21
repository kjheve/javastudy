package com.kh.day3;

import java.util.Scanner;

/*
    1~10 사이의 임의의 정수 3개를 출력하고
    이중 최대값과 최소값을 출력하는 프로그램을 구하시오.
 */
// -> 임의로 출력안해서 다시 만듬
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 3개를 입력하시오");
        System.out.print("첫번째 정수 입력 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int num2 = scanner.nextInt();
        System.out.print("세번째 정수 입력 : ");
        int num3 = scanner.nextInt();

        if (num1 == num2) {
            if (num1 < num3) {
                System.out.println("최대값 : " + num3 + " 최소값 : " + num1);
            } else {
                System.out.println("최대값 : " + num1 + " 최소값 : " + num3);
            }
        } else if (num1 > num2) {
            if (num1 < num3) {
                System.out.println("최대값 : " + num3 + " 최소값 : " + num2);
            } else {
                System.out.println("최대값 : " + num1 + " 최소값 : " + num2);
            }
        } else { // (num1 < num2)
            if (num1 < num3) {
                System.out.println("최대값 : " + num3 + " 최소값 : " + num1);
            } else {
                System.out.println("최대값 : " + num2 + " 최소값 : " + num1);
            }
        }
    }
}
