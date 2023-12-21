package com.kh.day1;

// 한줄 주석
/*
    여러줄 주석
 */
// 산술 연산자 : +(덧셈), -(뺄셈), *(곱셈), /(나눗셈), %(나머지)
public class Test4 {
    public static void main(String[] args) {
        int kor = 90;   // 국어점수
        int eng = 80;   // 영어점수
        int mat = 70;   // 수학점수

        int sum = kor + eng + mat;   // 총계
        int avg = sum / 3;   // 평균

        System.out.println(sum);
        System.out.println(avg);
    }
}