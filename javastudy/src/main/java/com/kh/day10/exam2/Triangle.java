package com.kh.day10.exam2;

public class Triangle extends Shape {
    private double bottom, height;

    Triangle(double b, double h) {
        this.bottom = b;
        this.height = h;
    }

    @Override
    double calcArea() { // 삼각형 넓이 계산
        return bottom * height / 2;
    }

    @Override
    public void coloring() {
        System.out.println("삼각형을 색칠");
    }
}
