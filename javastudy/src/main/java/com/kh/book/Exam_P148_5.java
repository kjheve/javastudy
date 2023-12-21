package com.kh.book;

public class Exam_P148_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2) {
                    continue; // for문 안으로 이동(j)
                }
                if (j == 1) {
                    break; // for문 바깥으로 이동 (i)
                }
                System.out.println("A");
            }
        }
    }
}
