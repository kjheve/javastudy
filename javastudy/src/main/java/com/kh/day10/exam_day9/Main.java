package com.kh.day10.exam_day9;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        System.out.println(p1); // toString()이 생략 되어있다.
        System.out.println(p1.toString());

        Person p2 = new Person("홍길동", 20); // 동명이인으로 생각

        System.out.println(p1.equals(p2));

        Person p3 = new Person("홍길동", 21);

        // 재정의를 이름, 나이 둘 다 같아야 하기 때문에 다르게 나옴
        System.out.println(p2.equals(p3));
        
    }
}
