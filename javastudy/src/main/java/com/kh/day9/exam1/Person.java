package com.kh.day9.exam1;
/*
    상속 : 부모의 특성(속성, 행위)를 자식이 물려받는 성질
          모든 클래스의 최상위 클래스는 Object 클래스 이다.
          인스턴스의 생성순서는 최상위 클래스부터
          순차적으로 만들어진다.

    super : 부모의 멤버에 접근
    super() : 부모의 생성자 메소드 호출

    메소드 오버라이딩(overriding) : 메소드 재정의
 */
import java.lang.*; // import 하지 않더라도 자동으로 되어있음

public class Person extends Object { // Object 상속 생략 되어 있음
    public Person() {
        super(); // 부모의 기본생성자 호출
        System.out.println("Person.Person");
    }
    public void eat() {
        System.out.println("먹는다.");
    }
}
