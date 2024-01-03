package com.kh.day9.exam4;
// 상속이 안되는 것들 3가지
public class Parent {
    String instanceField;
    public Parent() {super();} // 생성자 메소드
    private String privateField; // private 필드
    private void privateMethod(){} // private 메소드
    static void staticMethod(){} // 클래스 메소드 -> 상속 됨
    static String staticField; // 클래스 필드 -> 상속 됨
}
