package com.kh.day7.game;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;

/*
    제어자(modifier) : 접근제한자, static
    접근제한자(access modifier) : public, protected, default, private
 */

public class HangMan extends Object {
    private String[] words; // 단어장
    private char[] guesstedWord; // 힌트
    int attempts; // (default 생략) // 시도회수

    HangMan(String[] words_s) { // 생성자
        super(); // 부모클래스의 기본 생성자 호출
        this.words = words_s; // Main에서 속성값을 초기화
    }

    void run() {
        Random random = new Random();
        int idx = random.nextInt(words.length); // 0 ~ 9
        String word = words[idx];
        attempts = word.length() + 3; // 시도횟수 = 문자열 길이

        guesstedWord = makeUnderLine(word.length());

        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("현재단어 : " + String.valueOf(guesstedWord)); // 값을 문자열로 변경
            System.out.println("남은 시도 회수 : " + attempts);

            // 글자입력
            String str = "";
            while (true) { // 한글자, 영문 입력 안하면 무한루프
                System.out.print("글자를 입력하세요 : ");
                str = scanner.nextLine();

                // 한글자 확인 and 영문자 입력
                if (str.length() == 1 && str.matches("[a-zA-Z]")) {
                    str = str.toLowerCase(); // 대문자 입력받으면 소문자로 변환
                    break; // while문을 빠져나옴
                }
            }
            char ch = str.charAt(0);

            // 제시된 word와 내가 입력한 첫글자 ch과 비교
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) { // word.charAt(0) p
                    guesstedWord[i] = ch;
                    if (word.equals(String.valueOf(guesstedWord))) {
                        System.out.println("축하합니다! 단어를 맞췄습니다. : " + word);
                        return;
                    }
                }
            }
            attempts--;
        }
        System.out.println("아쉽습니다. 단어를 맞추지 못했습니다. 정답은 " + word + " 였습니다.");

    } // default 생략

    private char[] makeUnderLine(int len) {
        char[] underLine = new char[len];
        for (int i = 0; i < len; i++) {
            underLine[i] = '_';
        }
        return underLine;
    }
}
