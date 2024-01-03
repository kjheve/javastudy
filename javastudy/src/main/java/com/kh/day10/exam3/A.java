package com.kh.day10.exam3;

public interface A {
    double PI = 3.14; // public static final 생략됨
    void method1(); // 추상메소드
    default void method2() { // 디폴트 메소드
        System.out.println("A.method2");
    }

    // 클래스(정적) 메소드
    static double calcCicleArea(double radius) {
        return radius * radius * PI;
    }
}
