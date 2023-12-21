package com.kh.day2;

/*
    구구단 2단 출력하기
 */
public class GugudanExam {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " X " + i + " = " + String.format("%02d", i*j) + " ");
            }
            System.out.println(" ");
        }
    }
}
