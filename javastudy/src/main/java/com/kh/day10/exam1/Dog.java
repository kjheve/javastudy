package com.kh.day10.exam1;

public class Dog extends Animal{
    @Override
    void howl() {
        System.out.println("멍멍~");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("개가 먹음");
    }

    @Override
    public void run() {
        System.out.println("개가 달림");
    }
}
