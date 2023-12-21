package com.kh.day2.home;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println(" -- 2단 --  -- 3단 --  -- 4단 --  -- 5단 -- ");
        for (int j = 1; j <= 9; j++) {
            for (int i = 2; i <= 5; i++) {
                System.out.print(i + " X " + j + " = " + String.format("%2d", i * j) + "|");
            }
            System.out.println("");
        }
        System.out.println(" -- 6단 --  -- 7단 --  -- 8단 --  -- 9단 -- ");
        for (int j = 1; j <= 9; j++) {
            for (int i = 6; i <= 9; i++) {
                System.out.print(i + " X " + j + " = " + String.format("%2d", i * j) + "|");
            }
            System.out.println("");
        }
    }
}
