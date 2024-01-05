package com.kh.day11.q6_2;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // 직각 삼각형 인가?
    public boolean is_right() {
        boolean isRight = false;
        int side1A = side1 * side1;
        int side2A = side2 * side2;
        int side3A = side3 * side3;
        if(side1A == side2A + side3A || side2A == side1A + side3A
                || side3A == side1A + side2A) {
            isRight = true;
        }
        return isRight;
    }
    
    // 이등변 삼각형 인가?
    public boolean is_isosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

}
