package com.kh.day1;

public class For2 {
    public static void main(String[] args) {
        // 1~10 짝수의 합
        int sum = 0;
        int i = 1;
        for (; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
