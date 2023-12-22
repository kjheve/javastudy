package com.kh.day4;

import java.util.Scanner;

public class Question1_Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.print("과목수 : ");
            int countOfSubject = scanner.nextInt();

            if (countOfSubject == 0) {
                stop = true;
                continue;
            }

            int[] subjects = new int[countOfSubject];

            for (int i = 0; i < subjects.length; i++) {
                System.out.print("과목" + (i+1) + " : ");
                subjects[i] = scanner.nextInt();
            }

            // 총점
            int sum = 0;
            for (int i = 0; i < subjects.length; i++) {
                sum += subjects[i];
            }
            System.out.println("총점 = " + sum);
            // 평균
            double avg = (double) sum / subjects.length;
            System.out.println("평균 = " + avg);
        }
        System.out.println("프로그램 종료!");
    }
}