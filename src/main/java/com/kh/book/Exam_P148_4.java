package com.kh.book;

public class Exam_P148_4 {
    public static void main(String[] args) {
        // case 1)
        for (int i = 10; i > 0; i-=2) {
            System.out.println(i);
        }

        // case 2)
        int j = 10;
        while (j > 0) {
            System.out.println(j);
            j -= 2;
        }
        // case 3)
        int k = 10;
        do {
            System.out.println(k);
            k -= 2;
        } while(k > 0);
    }
}
