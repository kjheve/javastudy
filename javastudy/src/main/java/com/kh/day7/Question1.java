package com.kh.day7;

import java.util.Scanner;

/*
    단어 맞추기 게임
    단어는 'program'로 설정되어있다.
    사용자는 남은 시도 횟수 안에 정답 단어를 맞추면 게임에서 이기게되고 그렇지않으면 진다.
    단어를 맞출 수 있는 회수는 단어의 문자수 + 3
    ex) program

    현재 단어 : _______
    남은 시도 회수 : 10
    글자를 입력하세요 : p
    현재 단어 : p______
    남은 시도 회수 : 9
    글자를 입력하세요 : z
    현재 단어 : p______
    남은 시도 회수 : 8
    글자를 입력하세요 : r
    현재 단어 : pr__r__
    남은 시도 회수 : 7
    글자를 입력하세요 :
    ....
    현재 단어 : progra_
    남은 시도 회수 : 1
    글자를 입력하세요 : m
    축하합니다! 단어를 맞췄습니다. : program
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "program";
        String[] underDash = new String[word.length()];
        for (int i = 0; i < underDash.length; i++) {
            underDash[i] = "_";
            System.out.print(underDash[i]);
        }
        System.out.println();
        System.out.println(word.charAt(0));

        for (int i = 0; i < word.length(); i++) {
            char correct = scanner.nextLine().charAt(i);
            if (correct == word.charAt(i)) {

            }
        }
    }
}
//        underDash[0] = String.valueOf(word.charAt(0));
//        System.out.println(underDash[0]);

