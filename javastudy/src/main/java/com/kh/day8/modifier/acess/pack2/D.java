package com.kh.day8.modifier.acess.pack2;

import com.kh.day8.modifier.acess.pack1.A;

public class D extends A {
    public void print() {
        //멤버 활용
        System.out.print(a + " ");
        System.out.print(b + " ");
        // 자식 클래스는 다른 패키지에 있어도 객체의 생성 없이
        // protected 접근 지정자 필드까지 접근 가능
//        System.out.print(c + " ");
//        System.out.print(d);
        System.out.println();
    }
}
