package com.kh.day10.excercise12.q2_P421;

abstract class A {
    abstract void abc();
}
class B extends A {
    void abc() {
        System.out.println("안녕하세요!?");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.abc();
    }
}
