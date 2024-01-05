package com.kh.day11.q6;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int s1, int s2, int s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    // 직각삼각형 확인
    public boolean is_right() {
        int squareA = side1 * side1;
        int squareB = side2 * side2;
        int squareC = side3 * side3;

        // 피타고라스의 정리를 사용하여 직각 삼각형인지 판단
        return squareA + squareB == squareC || squareA + squareC == squareB
                || squareB + squareC == squareA;
    }

    // 이등변삼각형 확인
    public boolean is_isosceles() {
        return (side1 == side2) || (side2 == side3) || (side1 == side3);
    }

}
