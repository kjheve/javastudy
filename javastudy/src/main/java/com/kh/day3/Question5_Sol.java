package com.kh.day3;

import java.util.Scanner;

public class Question5_Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        while (!stop) {
            System.out.println("---------------------------");
            System.out.println("메뉴 : 1. 사각형 2. 원 3. 종료");
            System.out.println("---------------------------");
            System.out.print("구하고자하는 도형 : ");
            int menu = scanner.nextInt();

            // case 1)
/*            switch (menu) {
                case 1: // 사각형의 넓이 구하기
                    System.out.print("가로 : ");
                    double w = scanner.nextDouble();
                    System.out.print("세로 : ");
                    double h = scanner.nextDouble();
                    double wide = w * h;
                    System.out.println("넓이 " + wide);
                    break;
                case 2: // 원의 넓이 구하기
                    System.out.print("반지름 : ");
                    double r = scanner.nextDouble();
                    double wideOfCircle = r * r * Math.PI;
                    System.out.println("넓이 = " + String.format("%.2f", wideOfCircle));
                    break;
                case 3: // 종료하기
                    stop = true;
                    break;
                default:
                    System.out.println("없는 메뉴 입니다.");
            }*/
            // case 2)
            if (menu == 1) {
                System.out.print("가로 : ");
                double w = scanner.nextDouble();
                System.out.print("세로 : ");
                double h = scanner.nextDouble();
                double wide = w * h;
                System.out.println("넓이 " + wide);
            } else if (menu == 2) {
                System.out.print("반지름 : ");
                double r = scanner.nextDouble();
                double wideOfCircle = r * r * Math.PI;
                System.out.println("넓이 = " + String.format("%.2f", wideOfCircle));
            } else if (menu == 3) {
                stop = true;
            } else {
                System.out.println("없는 메뉴 입니다.");
            }
        }
        System.out.println("프로그램 종료!!");
    }
}
