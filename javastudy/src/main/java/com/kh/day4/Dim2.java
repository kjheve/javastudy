package com.kh.day4;

public class Dim2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
//        int[][] arr = new int[행][열];

//        System.out.println(arr); // 100번지
//        System.out.println(arr.length); // 행의 길이
//        System.out.println(arr[0]); // 200번지
//        System.out.println(arr[1]); // 300번지
//        System.out.println(arr[0].length); // 열의 길이
//        System.out.println(arr[1].length); // 열의 길이
//        System.out.println(arr[0][0]); // arr[0][0] 값
//        System.out.println(arr[0][1]); // arr[0][1] 값
//        System.out.println(arr[0][2]); // arr[0][2] 값
//        System.out.println(arr[1][0]); // arr[1][0] 값
//        System.out.println(arr[1][1]); // arr[1][1] 값
//        System.out.println(arr[1][2]); // arr[1][2] 값

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
