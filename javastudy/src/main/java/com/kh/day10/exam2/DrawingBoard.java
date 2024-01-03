package com.kh.day10.exam2;

public class DrawingBoard {
    private Shape[] shapes;
    private int index;

    DrawingBoard(int size) { // 생성자로 Shape 타입의 배열 크기를 정함
        this.shapes = new Shape[size];
    }

    void addShapes(Shape shape) { // 도형 추가
        this.shapes[index++] = shape;
    }

    void shapesCalcArea() { // 도형의 면적 계산
        // case 1) 일반 for문
//        for (int i = 0; i < shapes.length; i++) {
//            if (shapes[i] instanceof Circle) {
//                System.out.println("원의 넓이 : " + s.calcArea());
//            } else if (shapes[i] instanceof Rectangle) {
//                System.out.println("사각형의 넓이 : " + s.calcArea());
//            } else if (shapes[i] instanceof Triangle) {
//                System.out.println("삼각형의 넓이 : " + s.calcArea());
//            }
//        }
        // case 2) for-each문
        for (Shape s : shapes) {
            if (s instanceof Triangle) {
                System.out.println("삼각형의 넓이 : " + s.calcArea());
            } else if (s instanceof Rectangle) {
                System.out.println("사각형의 넓이 : " + s.calcArea());
            } else if (s instanceof Circle) {
                System.out.println("원의 넓이 : " + s.calcArea());
            } else {
                System.out.println("null 공간이 있습니다.");
            }
        }

//        for (Shape shape : shapes) {
//            if (shape != null) {
//                System.out.println(shape.calcArea());
//            }
//        }

    }

}
