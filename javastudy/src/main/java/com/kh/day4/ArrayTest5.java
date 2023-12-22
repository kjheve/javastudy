package com.kh.day4;

public class ArrayTest5 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        // 정수형 2차원 배열 선언, 생성, 초기화(타입의 디폴트값)
        int[][] jumsu = new int[2][2];
        jumsu[0][0] = 1;
        jumsu[0][1] = 2;
        jumsu[1][0] = 3;
        jumsu[1][1] = 4;

//        System.out.println(jumsu.length); // 행의 갯수를 따라감
//        System.out.println(jumsu[0].length); // 열의 갯수를 따라감
//        System.out.println(jumsu);
//        System.out.println(jumsu[0] + " " + jumsu[1]);

        for (int i = 0; i < jumsu.length; i++) { // jumsu.length = 2
            for (int j = 0; j < jumsu[i].length; j++) { // jumsu[i].length = 2
                System.out.print(jumsu[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void method2() {

    }

}
