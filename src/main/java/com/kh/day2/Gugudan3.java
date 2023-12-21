package com.kh.day2;

// 구구단 2단 ~ 9단까지 짝수단 출력
public class Gugudan3 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            if (i % 2 != 0) {
                continue; // 이하 로직은 수행되지 않고 증감식으로 이동
            }
//            if (i == 5) {
//                break; // 가장 가까운 반복문을 빠져나옴
//            }
            System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}
