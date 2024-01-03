package com.kh.day10.exam3;
/*
    인터페이스의 특징
        1. 모든 멤버는 public
        2. 모든 필드는 상수로 public static final
        3. 타입으로 사용됨, 인스턴스 생성 불가
        4. 다중 구현, 다중 상속
    인터페이스 멤버
        - 필드 : 상수(final)
        - 메소드 :
          ㅇ추상 메소드(abstract) : 본문이 없는 미완성 메소드
          ㅇ디폴트 메소드(default) : 하위호환성
          ㅇ클래스 메소드(static)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(A.PI);
        System.out.println(A.calcCicleArea(3.0));

        B b = new B();
        b.method1();
        b.method2();
    }
}
