package com.kh.day2.home;

import java.util.Scanner;

public class KrEnMat_SumAvg {
    public static void main(String[] args) {
        System.out.println("과목별 점수를 입력하면 합계와 평균을 알려드림");
        Scanner scanner = new Scanner(System.in); // 콘솔창에 입력 받을 때 필요

        System.out.print("국어점수 입력 : ");
        int kr = scanner.nextInt(); // 국어점수 입력 받기
        System.out.print("영어점수 입력 : ");
        int en = scanner.nextInt(); // 영어점수 입력 받기
        System.out.print("수학점수 입력 : ");
        int mat = scanner.nextInt(); // 수학점수 입력 받기

        int sum = hab(kr, en, mat); // 메서드에서 반환 받은 값을 sum으로 저장
        double avg = average(kr, en, mat); // 메서드에서 반환 받는 값을 avg로 저장

        System.out.println("3과목 합계 : " + sum);
        System.out.println("3과목 평균 : " + String.format("%.1f", avg));
    }
    // 합계를 구해서 반환 받는 메서드
    public static int hab(int a, int b, int c) {
        return a + b + c;
    }
    // 평균을 구해서 반환 받는 메서드
    public static double average(int x, int y, int z) {
        return (double) hab(x, y, z) / 3;
    }
}