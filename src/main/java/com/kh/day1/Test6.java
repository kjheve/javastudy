package com.kh.day1;
// 부호연산자 : +, -
// 대입연산자 : =, +=, -=, *=, /=, %=
// 논리연산자 : 부정(NOT), 그리고(AND), 또는(OR)
//               !     ,      &&   ,   ||
// 비트연산자 :    !     ,      &    ,   |
// 문자열 연결연산자 : + (피연산자 중에 적어도 하나는 문자열이여야함)

public class Test6 {
    public static void main(String[] args) {
        // 자료형 : 정수, 실수, 문자열, 논리형
        int a = 10;
        double b = 3.14;
        String name = "홍길동";
        boolean flag = true;   // true or false

        boolean result = 5 != 6;   // true
        int sum = 10 + 20;   // 30

        if(!result) {
            System.out.println("참");
        }
        else {
            System.out.println("거짓");
        }
    }
}
