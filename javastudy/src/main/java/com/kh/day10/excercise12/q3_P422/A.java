package com.kh.day10.excercise12.q3_P422;

abstract public class A {
    abstract void abc();
}

class B extends A {
    @Override
    void abc() {
        System.out.println("반갑");
    }
}