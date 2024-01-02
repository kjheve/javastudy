package com.kh.day9.excercise10.Q4_P372;

public class Main {
    public static void main(String[] args) {
//        A a1 = new A();
//        B b1 = (B)a1;
//        C c1 = (C)a1;
//        D d1 = (D)a1;
//        E e1 = (E)a1;
//
        A a2 = new B();
        B b2 = (B)a2;
        b2.methodA();
        b2.methodB();
//        C c2 = (C)a2;
//        D d2 = (D)a2;
//        E e2 = (E)a2;

        A a3 = new C();
        B b3 = (B)a3;
        C c3 = (C)a3;
        b3.methodA();
        b3.methodB();
        c3.methodA();
        c3.methodB();
        c3.methodC();
//        D d3 = (D)a3;
//        E e3 = (E)a3;
    }
}
