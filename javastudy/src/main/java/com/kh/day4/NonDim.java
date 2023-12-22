package com.kh.day4;

/*
    [0]ㅁ    ->      ㅁ
    [1]ㅁ    ->      ㅁ ㅁ ㅁ
    [2]ㅁ    ->      ㅁ ㅁ
    [3]ㅁ    ->      ㅁ ㅁ ㅁ
                    [0][1][2]
    (스택영역)         (힙영역)
 */

public class NonDim {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[1];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[3] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
