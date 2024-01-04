package com.kh.day11.q1;

import java.util.Scanner;

public class Student {
    private int studentnumber; // 학번
    private String name; // 이름
    private int testScore1, testScore2, testScore3;
    Scanner scanner = new Scanner(System.in);

    Student(int studentnumber, String name, int testScore1, int testScore2, int testScore3) {
        super();
        this.studentnumber = studentnumber;
        this.name = name;
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    public void setScore(int num) {
        if (num == 1) {
            System.out.print("1의 새로운 점수 입력 : ");
            this.testScore1 = scanner.nextInt();
        } else if (num == 2) {
            System.out.print("2의 새로운 점수 입력 : ");
            this.testScore2 = scanner.nextInt();
        } else if (num == 3) {
            System.out.print("2의 새로운 점수 입력 : ");
            this.testScore2 = scanner.nextInt();
        }
    }

    public int getScore(int num) {
        int result = 0;
        if (num == 1) {
            result = this.testScore1;
        } else if (num == 2) {
            result = this.testScore2;
        } else if (num == 3) {
            result = this.testScore3;
        }
        return result;
    }

    double getAverage() {
        return (testScore1+testScore2+testScore3)/(double)3;
    }

    @Override
    public String toString() {
        String str = "";
        str += "학번 : " + studentnumber + "\n";
        str += "이름 : " + name + "\n";
        str += "testscore1 : " + testScore1 + "\n";
        str += "testscore2 : " + testScore2 + "\n";
        str += "testscore3 : " + testScore3 + "\n";
        str += "평균 : " + getAverage() + "\n";
        return str;
    }

    public static void main(String[] args) {
        Student st1 = new Student(1, "김씨", 50, 60, 70);

        System.out.println(st1);

        Scanner sc = new Scanner(System.in);
        System.out.print("바꿀 과목 선택 : ");
        int num = sc.nextInt();
        st1.setScore(num);
    }
}
