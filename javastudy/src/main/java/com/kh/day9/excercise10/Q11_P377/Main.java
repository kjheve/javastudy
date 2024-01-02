package com.kh.day9.excercise10.Q11_P377;

class A {
    int data;
    A(int data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println(a1.equals(a2));
    }
}
