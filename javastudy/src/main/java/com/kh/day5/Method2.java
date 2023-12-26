package com.kh.day5;

/*
    표현식(4가지) : 값(리터럴), 변수, 식, 메소드
    지역 변수 : 메소드 내에 선언된 변수
    매개 변수(parameter) : 메소드 호출시 입력받는 값으로 초기화 변수
                          메소드 본문에서 지역변수로 사용된다.
    인수(argument) : 메소드 호출할 때 전달하는 값
 */

public class Method2 {
    public static void main(String[] args) {
        method1(); // case 1)

        int result2 = method2(); // case 2)
        System.out.println("result2 = " + result2);
        
        method3(3); // 인수(argument) // case 3)

        int result4 = method4(10, 20); // case 4)
        System.out.println("result4 = " + result4);

    }

    // 반환 타입(X), 매개변수(X)
    public static void method1() {
        System.out.println("method1()");
    }

    // 반환 타입(O), 매개변수(X)
    public static int method2() {
        int x = 10;
        int y = 20;
        return x + y;
    }

    // 반환 타입(X), 매개변수(O)
    public static void method3(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 반환 타입(O), 매개변수(O)
    public static int method4(int x, int y) {
        return x + y;
    }


}
