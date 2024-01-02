package com.kh.day8.modifier.st.exam1;

public class CarMain2 {
    public static void main(String[] args) {
        // static (메소드)는(은) 클래스 레벨이기 때문에
        // 객체를 생성하지 않고 바로 접근 가능
        System.out.println(Car.cnt2);
        Car.method2();
    }
}
