package com.kh.day9.excercise10.Q9_P376;
/*
    클래스내에 생성자가 없으면 컴파일러가 기본생성자를 자동 생성해준다.
    클래스내에 명시적으로 정의된 생성자가 하나라도 존재하면 컴파일러는
    기본생성자를 생성하지 않는다.
 */
class A {
    A() {
        super();
    }
    A(int a) {
        System.out.println("A 생성자");
    }
}
class B extends A {
//    B() {
//        super(3);
//    }
}

public class Main {
}
