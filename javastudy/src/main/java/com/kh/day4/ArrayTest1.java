package com.kh.day4;


public class ArrayTest1 {
    public static void main(String[] args) {
//        int kor = 90;
//        int eng = 83;
//        int math = 74;
//
//        int sum = kor + eng + math;
//        double avg = (double) sum / 3;
//
//        System.out.println("총계 = " + sum);
//        System.out.println("평균 = " + String.format("%.2f", avg));

        int[] subjects; // 정수형 배열 선언
        subjects = new int[3]; // 정수형 배열 생성

        subjects[0] = 90; // 국어
        subjects[1] = 83; // 영어
        subjects[2] = 74; // 수학

//        int sum = subjects[0] + subjects[1] + subjects[2];
        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            sum += subjects[i];
//        }
        for (int i = 0; i < subjects.length; i++) {
            sum += subjects[i];
        }
        double avg = (double) sum / subjects.length; // sum / 3

        System.out.println("총계 = " + sum);
        System.out.println("평균 = " + String.format("%.2f", avg));
    }
}
