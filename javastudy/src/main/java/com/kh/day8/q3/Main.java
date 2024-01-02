package com.kh.day8.q3;

public class Main {
    // case 1)
    public static int factorial(int x) {
        // x * x-1 * x-2 * x-3 * ... 1
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1); // 재귀호출
        }
    }

    public static void main(String[] args) {
        // case 1)
        int result = factorial(5);
        System.out.println("result = " + result);

        // case 2)
        System.out.println(MathUtil.factorial(5));

        // case 3)
        System.out.println(MathUtil.getResult());
    }
}
