package com.kh.day6;

// import java.lang.*; // 기본 패키지는 import 하지 않더라도 자동 포함됨

//import java.util.*; // 표준 라이브러리
import java.util.Random; // 표준 라이브러리
import java.util.Scanner; // 표준 라이브러리


/*
    표준 클래스 -> 표준 라이브러리 (ex. Scanner, Random)
    사용자 정의 클래스 -> 사용자 정의 라이브러리
    제3자가 정의한 클래스 -> 3rd party 라이브러리 (유료, 무료) Third Party 라이브러리

    클래스 : 개념(명사, 동사) 설계 도구
    객체 : 실세계의 객체, 가상세계의 객체
    인스턴스 : 가상세계의 객체 하나하나를 가리킬 때
    인스턴스화(실체화) : 클래스를 통해 객체(인스턴스)를 만드는 과정 (new)
 */
public class PersonMain2 {
    public static void main(String[] args) {
        Person person3 = new Person("홍길서"); // 객체 생성
        System.out.println(person3.name);
        System.out.println(person3.age);

        Person person4 = new Person("홍길남", 40);
        System.out.println(person4.name);
        System.out.println(person4.age);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

    }
}