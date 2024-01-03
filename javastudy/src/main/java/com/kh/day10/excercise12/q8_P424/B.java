package com.kh.day10.excercise12.q8_P424;

public class B implements A{
    @Override
    public void abc() {
        A.super.abc();
        System.out.println("B 클래스의 abc()");
    }
}
