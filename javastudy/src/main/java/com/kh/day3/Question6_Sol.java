package com.kh.day3;

import java.util.Scanner;

public class Question6_Sol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Number : ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        System.out.println("프로그램 종료!!");

    }
}