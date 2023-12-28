package com.kh.day6.exam_P263;

public class AMain {
    public static void main(String[] args) {
        A a = new A();
        a.print(); // 입력값이 없습니다.
        a.print(3); // 정수 입력값 : 3
        a.print(5.8); // 실수 입력값 : 5.8
        a.print("안녕"); // 문자열 입력값 : 안녕
    }
}
