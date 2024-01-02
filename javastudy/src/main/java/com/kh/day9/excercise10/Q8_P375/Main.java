package com.kh.day9.excercise10.Q8_P375;

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
