package com.kh.day9.excercise10.Q11_P377;

/*

    동일 비교 : 인스턴스의 주소를 비교
    동등 비교 : 인스턴스의 내용 비교

    Object.equals() : 기본적으로는 "==" 비교를함. 즉 주소비교를 한다.
    따라서 동등 비교를 위해서는 하위클래스에서 재정의해서 동등비교용도로 사용됨.
    Do it Java P.377 Q.12)
 */

import java.util.Objects;

class A {
    int data;
    A(int data) {
        this.data = data;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof A) {
//            A a = (A) obj;
//            if (this.data == a.data) {
//                return true;
//            }
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return data == a.data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println(a1.equals(a2));
//
//
//        System.out.println(a1 == a2); // '==' 참조타입 비교는 주소비교(동일 객체인지 비교)
//        A a3 = a1;
//        System.out.println(a1 == a3);
    }
}
