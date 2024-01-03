package com.kh.day9.excercise10.Q8_P375;
/*
    필드와 정적 메소드는 참조 변수의 타입에 따라 접근하고,
    인스턴스 메소드는 실제 인스턴스의 타입에 따라 접근한다.
    자바에서 인스턴스 메소드만 재정의 가능하다.
    인스턴스 필드와 클래스 필드, 클래스 메소드는 재정의가 아니라 숨김이 발생
    exam4
 */
class A {
    int m =2;
    static int n = 4;
    void method1() {
        System.out.println("A클래스 인스턴스 메소드");
    }
    static void method2() {
        System.out.println("A클래스 static 메소드");
    }
}
class B extends A {
    int m = 6;
    static int n = 8;
    void method1() {
        System.out.println("B클래스 인스턴스 메소드");
    }
    static void method2() {
        System.out.println("B클래스 static 메소드");
    }
}

public class Main {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println(ab.m);
        System.out.println(ab.n);
        ab.method1();
        ab.method2();
    }
}
