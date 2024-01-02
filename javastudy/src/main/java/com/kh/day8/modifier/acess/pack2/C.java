package com.kh.day8.modifier.acess.pack2;

import com.kh.day8.modifier.acess.pack1.A; // pack1의 클래스 A 임포트
public class C {
    public void print() {
        // 패키지가 다르기 때문에 A 객체 생성시 import 해야함
        A a = new A();

        // 멤버 활용
        System.out.print(a.a + " ");
        // 다른 패키지 내의 클래스에서는
        // 자식 클래스가 아닐 때는 public 접근 지정자만 사용 가능
//        System.out.print(a.b + " ");
//        System.out.print(a.c + " ");
//        System.out.print(a.d + " ");
        System.out.println();
    }
}
