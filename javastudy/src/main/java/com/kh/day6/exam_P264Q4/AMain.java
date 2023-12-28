package com.kh.day6.exam_P264Q4;

import java.util.Arrays;

public class AMain {
    public static void main(String[] args) {
        A a = new A();

        int m = 5;
        int[] n = {1, 2, 3};
        System.out.println(Arrays.toString(n));

        a.abc(m);
        a.bcd(n);

        System.out.println(m);
        System.out.println(Arrays.toString(n));
    }
}
