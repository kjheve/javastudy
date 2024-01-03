package com.kh.day10.exam1;

abstract public class Animal implements Activity {
    abstract void howl();

    @Override
    public void eat() {
        System.out.println("먹는다");
    }

    @Override
    public void run() {
        System.out.println("달린다");
    }
}
