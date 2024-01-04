package com.kh.day11.q6_2;

// 배열로 만들기
public class TriangleDriver2 {
    public static void main(String[] args) {
        Triangle[] triangles = {new Triangle(3, 5, 7), new Triangle(3, 4, 5), new Triangle(7, 10, 7)};

        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].is_right()) {
                System.out.println("Triangle " + (i + 1) + "은 직각삼각형이다.");
            } else if (triangles[i].is_isosceles()) {
                System.out.println("Triangle " + (i + 1) + "은 이등변삼각형이다");
            } else {
                System.out.println("Triangle " + (i + 1) + "은 직각or이등변 삼각형도 아니다");
            }

        }

    }
}