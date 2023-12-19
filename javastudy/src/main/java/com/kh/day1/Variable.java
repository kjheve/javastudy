package com.kh.day1;

public class Variable {
    public static void main(String[] args) {
        int x;  // 변수 선언
        x = 10;   // 변수 초기화 : 처음 값을 할당
        x = 20;   // 변수 재할당
        System.out.println(x);
        int y = 10;   // 변수 선언 + 초기화
        y = 30;   // 변수 재할당
        // z = 10;   자료형 없이는 선언 불가능
        int z;
        z = 10;
        int sum = x + y;  // 변수 x값, y값을 더한 후 sum변수에 초기화
        System.out.println("sum=" + sum);

        int i; // 변수 선언
        i = 100; // 변수 초기화
        System.out.println("i=" + i);
    }
}
