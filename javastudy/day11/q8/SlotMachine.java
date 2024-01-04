package com.kh.day11.q8;

import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        Random random = new Random();
        int number1, number2, number3;
        boolean stop = false;
        int cnt = 1;
        int cnt2 = 1;
        int cnt3 = 1;

        while (!stop) {
            number1 = random.nextInt(50) + 1;
            number2 = random.nextInt(50) + 1;
            number3 = random.nextInt(50) + 1;
            System.out.println(number1 + ", " + number2 + ", " + number3);
            if (number1 == number2) {
                if (number1 == number3) {
                    System.out.println("1등에 당첨되었습니다!");
                    stop = true;
                } else {
                    System.out.println("2등에 당첨되었습니다!");
                    cnt++;
                    cnt2++;
                }
            } else if (number2 == number3) {
                if (number2 == number1) {
                    System.out.println("1등에 당첨되었습니다!");
                    stop = true;
                } else {
                    System.out.println("2등에 당첨되었습니다!");
                    cnt++;
                    cnt2++;
                    cnt3++;
                }
            } else {
                System.out.println("꽝입니다!");
                cnt++;
            }
        }
        System.out.println("1등 당첨까지 걸린 횟수 : " + cnt);
        System.out.println("2등 당첨 횟수 : " + cnt2);
        System.out.println("꽝 횟수 : " + cnt3);


    }
}
