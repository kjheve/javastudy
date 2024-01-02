// 패키지 pack1, pack2의 Main / P.285 예제니깐 참고!
package com.kh.day8.modifier.acess;

// 동일 패키지가 아니기 때문에 import 해야함
import com.kh.day8.modifier.acess.pack1.A;
import com.kh.day8.modifier.acess.pack1.B;
import com.kh.day8.modifier.acess.pack2.C;
import com.kh.day8.modifier.acess.pack2.D;
//import com.kh.day8.modifier.acess.pack1.*;
//import com.kh.day8.modifier.acess.pack2.*;


public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();

    }
}
