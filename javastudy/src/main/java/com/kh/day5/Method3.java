package com.kh.day5;

/*
    메소드 오버로딩(overloading)
        : 메소드 이름을 동일하게
          but 반환타입, 매개변수 갯수, 매개변수 타입은 달라야 함
     주의) 메소드 이름은 같고 '매개변수가 동일'하면 반환타입에 상관없이
          메소드 오버로딩(X)
 */

public class Method3 {
    public static void main(String[] args) {
        int result = add(10, 20);
        int result2 = add(10, 20, 30);

        printScreen(1);
        printScreen(1.0);
        printScreen("1");
    }

    public static int add(int x, int y) {
        return x + y;

    }
    /* public static void add(int x, int y) {
        // 반환타입이 달라도 -> 매개변수의 갯수와 타입이 같으면 안됨
    } */

    public static double add(double x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void printScreen(int x) {
        System.out.println(x);
    }

    public static void printScreen(double x) {
        System.out.println(x);
    }

    public static void printScreen(String x) {
        System.out.println(x);
    }

}
