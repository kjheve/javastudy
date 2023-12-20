package com.kh.day2;

import java.util.Scanner;

/*
    구구단 2단 출력하기
 */
public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 단수 입력 : ");
        int dansu = scanner.nextInt();

        System.out.println("---구구단 " + dansu + "단---");
        for (int i = 1; i < 10; i++) {
            System.out.println(dansu + " X " + i + " = " + dansu*i);
        }
    }
}
