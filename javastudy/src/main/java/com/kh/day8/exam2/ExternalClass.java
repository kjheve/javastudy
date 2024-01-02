package com.kh.day8.exam2;

public class ExternalClass {
    String field1;
    int field2;

    public static void main(String[] args) {

        System.out.println("main() 시작");
        A a = new A();
        B b = new B();
        method1();
        System.out.println("main() 종료");

    }

    public static void method1() {
        System.out.println("method1() 호출됨");
        method2();
    }
    public static void method2() {
        System.out.println("method2() 호출됨");
    }

}