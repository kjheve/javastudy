package com.kh.day8.q3;

public class MathUtil {
    // case 2)
    private static int x, result;
    static {
        x = 5;
        result = factorial(5);
//        System.out.println("난 이 때 실행되여 = " + result);
    }
    static int factorial(int x) {
        // x * x-1 * x-2 * x-3 * ... 1
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1); // 재귀호출
        }
    }

    // case 3)
    static int getResult() {
        return result;
    }
}
