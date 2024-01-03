package com.kh.day10.exam2;

public class Rectangle extends Shape{
    private double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    double calcArea() { // 사각형의 넓이 계산
        return width * height;
    }

    @Override
    public void coloring() {
        System.out.println("사각형을 색칠");
    }
}
