package com.kh.day1;

import java.util.Scanner;

/*
    Q) 국, 영, 수 점수를 콘솔에서 입력 받아
       총점과 평균을 구하는 프로그램을 작성하시오.
 */
public class KorEngMathJumsu {
    public static void main(String[] args) {
        // 1) 콘솔에서 국, 영, 수 점수 입력 받기
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();  콘솔로 부터 1줄 입력 받기
//                             (엔터를 만날 때까지의 값을 문자 읽어들임)
        System.out.print("국어 점수 : ");
        int kor = Integer.valueOf(scanner.nextLine());
        System.out.print("영어 점수 : ");
        int eng = Integer.valueOf(scanner.nextLine());
        System.out.print("수학 점수 : ");
        int math = Integer.valueOf(scanner.nextLine());

        // 2) 총점 계산하기
        int sum = kor + eng + math;

        // 3) 평균 계산하기
        double avg = (double)sum / 3;

        // 4) 총점, 평균 출력하기
        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + avg);
        System.out.printf("평균 = %.2f", avg);
    }
}
