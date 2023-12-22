package com.kh.day4;

import java.util.Random;

/*
    로또 생성기 (1 ~ 45) 중 6개 출력
    중복을 피해야함
 */
public class Question3 {
    public static void main(String[] args) {
        Random random = new Random();
//        int num = random.nextInt(45)+1; // 1 ~ 45값 출력

        int[] lotto = new int[6]; // 6개 출력
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1; // 1~6값 출력
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
//                    System.out.println("중복된 수 " + lotto[i]);
                    i--;
                }
                if (lotto[i] < lotto[j]) { // 낮은 순 대로 정렬
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
//            if (lotto[0] == lotto[i]) {
//                lotto[0] = random.nextInt(6)+1;
//            } else if (lotto[1] == lotto[i]) {
//                lotto[1] = random.nextInt(6)+1;
//            } else if (lotto[2] == lotto[i]) {
//                lotto[2] = random.nextInt(6)+1;
//            } else if (lotto[3] == lotto[i]) {
//                lotto[3] = random.nextInt(6)+1;
//            } else if (lotto[4] == lotto[i]) {
//                lotto[4] = random.nextInt(6)+1;
//            } else if (lotto[5] == lotto[i]) {
//                lotto[5] = random.nextInt(6)+1;
//            }
        // 출력
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
