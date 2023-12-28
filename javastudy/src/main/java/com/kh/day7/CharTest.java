package com.kh.day7;

import java.util.Scanner;

public class CharTest {
    public static void main(String[] args) {
        String word = "program";
        char ch = 'A';

        // word 문자열 길이
        System.out.println(word.length()); // => 7

        // word의 특정 위치의 문자 추출
        char ch2 = word.charAt(5); // => a
        System.out.println(ch2);

        // word중 특정 문자의 위치
        int idx = word.indexOf(ch2); // indexOf(a)의 위치 => 5
        System.out.println(idx);

        // 대문자 변환
        System.out.println(word.toUpperCase());

        //숫자 -> 문자열
        String s2 = String.valueOf(1.2); // 실수 -> 문자열
        System.out.println(s2); // 문자 "1.2"

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");

        String str = scanner.nextLine(); // asdf
        char ch3 = str.charAt(0); // a
//      같은말 =>  char ch3 = scanner.nextLine().charAt(0); // 메소드 체인으로 표현
        System.out.println(ch3);
    }
}
