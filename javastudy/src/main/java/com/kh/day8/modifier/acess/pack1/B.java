package com.kh.day8.modifier.acess.pack1;
public class B {
    public void print() {
        // 같은 패키지라 import가 필요없음
        A a = new A();

        // 멤버 활용
        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
//        System.out.print(a.d + " "); // private라 접근 불가능
        System.out.println();
    }
}
