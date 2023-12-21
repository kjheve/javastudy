package com.kh.day3;

import java.util.Scanner;

/*
    사용자로 부터 숫자를 입력받아 '*'를 정사각형 모양으로
    출력하는 프로그램을 구현하시오 (0을 입력하면 프로그램 종료)
    number : 3
    ***
    ***
    ***
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner 입력 = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.print("number(0 입력시 종료) : ");
            int num = 입력.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
//            System.out.print("*");
//            System.out.print("*");
//            System.out.println();
//            System.out.print("*");
//            System.out.print("*");
//            System.out.println();

            if (num == 0) {
                stop = true;
            }
        }
        System.out.println("프로그램 종료");
    }
}
