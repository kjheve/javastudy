package com.kh.day6.exam_P265_Q5;

public class A {

    void averageScore(int... num) {
        int sum = 0;
        // case 1) for-each문
        for (int i : num) {
            sum += i;
        }
        // case 2) 일반 for문
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//        }
        double avg = (double) sum / num.length;
        System.out.println(avg);
    }
}
