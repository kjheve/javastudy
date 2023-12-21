package com.kh.book;

public class Exam_P148_3 {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i); // 0, 2, 4, 6, 8, 10
            if (i == 10) {
                break;
            }
        }
    }
}
