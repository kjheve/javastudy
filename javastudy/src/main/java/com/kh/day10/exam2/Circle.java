package com.kh.day10.exam2;

public class Circle extends Shape {
    private double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    double calcArea() { // 원의 넓이 계산
        return radius * radius * Math.PI;
    }

    @Override
    public void coloring() {
        System.out.println("원을 색칠");
    }
}
