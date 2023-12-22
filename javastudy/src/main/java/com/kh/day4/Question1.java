package com.kh.day4;

/*
    과목 수를 콘솔로 부터 입력 받고 총계와 평균을 구하는 프로그램을 구현
    과목수 : 3
    과목1 : 90
    과목2 : 80
    과목3 : 70
    총계 : 240
    평균 : 80.0
 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("과목수 : ");
        int subjects = scanner.nextInt();

        int[] subj = new int[subjects];

//        int 과목수 = 3;
//        int[] 과목 = new int[3]


//        int[] 과목 = { , , , ...};
//        과목[0] = 숫자;
//        과목[1] = 숫자;
//        과목[2] = 숫자;
//        과목[3] = 숫자;
//        과목[...] = 숫자;

        int sum = 0;
        for (int i = 0; i < subj.length; i++) {
            System.out.print("과목"+(i+1)+" : ");
            subj[i] = scanner.nextInt();
            sum += subj[i];
        }
        double avg = (double)sum / subj.length;

        System.out.println("---결과---");
        System.out.println("총계 = " + sum);
        System.out.println("평균 = " + avg);
    }
}