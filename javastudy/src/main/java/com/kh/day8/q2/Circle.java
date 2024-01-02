package com.kh.day8.q2;

public class Circle {
    private final static double PI; // 클래스 변수 PI 선언
    static {
        PI = 3.14159; // 클래스 변수 PI 초기화
    }

    static double calculateArea(int radius) {
        return radius*radius*PI;
    }
}
