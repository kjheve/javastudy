package com.kh.day6.exam_P264Q3;

public class A {
    int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
