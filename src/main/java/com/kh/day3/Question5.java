package com.kh.day3;
/*
    도형의 넓이 구하기
    ---------------------------
    메뉴 : 1. 사각형 2. 원 3. 종료
    ---------------------------
    구하고자하는 도형 : 1
    가로 : 20
    세로 : 30
    넓이 : 600
 */
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            menu();
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.print("가로 : ");
                    int height = scanner.nextInt();
                    System.out.print("세로 : ");
                    int width = scanner.nextInt();
                    System.out.println("넓이 : " + rectangle(height, width));
                    break;
                case 2:
                    System.out.print("반지름 : ");
                    int r = scanner.nextInt();
                    System.out.println("넓이 : " + circle(r));
                    break;
                case 3:
                    stop = true;
                    break;
                default:
                    System.out.println("1 ~ 3 숫자를 입력하세요");
            }
        }
        System.out.println("프로그램 종료!");
    }

    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("메뉴 : 1. 사각형 2. 원 3. 종료");
        System.out.println("---------------------------");
        System.out.print("구하고자하는 도형 : ");
    }

    public static int rectangle(int a, int b) {
        return a * b;
    }

    public static double circle(double a) {
        return a * a * 3.14;
    }
}
