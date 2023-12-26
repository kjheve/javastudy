package com.kh.day5;

/*
    실행 클래스 : 실행 메소드가 있는 클래스
    실행 메소드 : main 메소드
    라이브러리 클래스 : 실행 메소드가 없는 클래스

    메소드 :
        - 실행문을 의미있게 묶는 단위.
        - 선언부(반환타입(void, 기본형, 참조형)+메소드이름+매개변수) + 본문

    void : 메소드를 호출한 곳에 반환할값이 없음을 뜻함.
 */

public class Method1 {
    public static void main(String[] args) { // 메소드 선언부
        System.out.println("main() 시작");

        // 메소드 호출
        method1();
        // 실행문 1 ~~~~~~~~~~~~~~
        // 실행문 2 ~~~~~~~~~~~~~~
        System.out.println("main() 종료");
    }

    public static void method1() {
        System.out.println("method1() 시작");
        method2();
        System.out.println("method1() 종료");
        // return; // 반환타입이 void일 경우 생략가능
    }
    public static void method2() {
        System.out.println("method2() 시작!");
        System.out.println("method2() 종료!");
        return;
    }

}
