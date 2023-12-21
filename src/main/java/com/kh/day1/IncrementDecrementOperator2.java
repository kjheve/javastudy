package com.kh.day1;

public class IncrementDecrementOperator2 {
    public static void main(String[] args) {
        int x = 10;
        int y;

        y = ++x; // 전위 증감 연산자
                 // 자기자신을 1증가 시킨 후 식에 참여
        System.out.println("x = " + x); // 11
        System.out.println("y = " + y); // 11

        y = x++; // 후위 증감 연산자
                 // 식에 참여 후 자기자신을 1증가 (x = 11을 y에 대입하고나서 ++)
        System.out.println("x = " + x); // 12
        System.out.println("y = " + y); // 11

        int z = ++x + y++; // 단항 연산자 순위가 더 높다
        System.out.println("x = " + x); // 13
        System.out.println("y = " + y); // 11 ...? 틀림 12임
        System.out.println("z = " + z); // 24
        // z = 24인 이유는 y++ 식에 참여하기 전 11값
        // y는 식에 참여했으니 y++을 시키면 12
    }
}
