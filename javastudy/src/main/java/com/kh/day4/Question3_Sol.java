package com.kh.day4;

import java.util.Random;

/*
    로또 생성기 (1 ~ 45) 중 6개 출력
    중복을 피해야함
 */
public class Question3_Sol {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lotto = new int[6]; // 6개 출력
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(6) + 1; // 1~6값 출력
            if (i == 0) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
