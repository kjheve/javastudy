package com.kh.book;

import com.kh.day1.HakJum;

/*
    학점 부여하기 A, B, C, F 학점
    Do it 자바 P.147_1 Switch로 응용
 */
public class Exam_P147_1 {
    public static void main(String[] args) {
        int score = 95;
        int result = score / 10;

        switch(result) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
        }

    }
}
