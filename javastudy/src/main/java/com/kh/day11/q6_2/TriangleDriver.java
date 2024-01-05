package com.kh.day11.q6_2;

public class TriangleDriver {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 5, 7);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Triangle triangle3 = new Triangle(7, 10, 7);


        if (triangle1.is_right()) {
            System.out.println("Triangle 1은 직각삼각형이다.");
        } else if (triangle1.is_isosceles()) {
            System.out.println("Triangle 1은 이등변삼각형이다");
        } else {
            System.out.println("Triangle 1은 직각or이등변 삼각형도 아니다");
        }


        if (triangle2.is_right()) {
            System.out.println("Triangle 2은 직각삼각형이다.");
        } else if (triangle2.is_isosceles()) {
            System.out.println("Triangle 2은 이등변삼각형이다");
        } else {
            System.out.println("Triangle 2은 직각or이등변 삼각형도 아니다");
        }


        if (triangle3.is_right()) {
            System.out.println("Triangle 3은 직각삼각형이다.");
        } else if (triangle3.is_isosceles()) {
            System.out.println("Triangle 3은 이등변삼각형이다");
        } else {
            System.out.println("Triangle 3은 직각or이등변 삼각형도 아니다");
        }
    }
}