package com.kh.day3;

/*
    1 ~ 10까지 짝수를 합산하는 프로그램 구하시오
    for, while, do~while
 */

public class Question1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() { // for문
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public static void method2() { // while문
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 1) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    public static void method3() { // do~while문
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 1) {
                i++;
                continue;
            }
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("sum = " + sum);
    }
}
