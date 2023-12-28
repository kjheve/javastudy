package com.kh.day7;

import java.util.Random;
import java.util.Scanner;

/*
단어 맞추기 게임
변경 : 단어는 'program'로 설정되어있다. => 단어 n개 정도 중에 랜덤하게 제시로 변경하기
사용자는 남은 시도 횟수 안에 정답 단어를 맞추면 게임에서 이기게되고 그렇지않으면 진다.
단어를 맞출 수 있는 회수는 단어의 문자수 + 3
ex) program
*/
public class Question1_Sol_Upgrade {
    public static void main(String[] args) {
        String[] words = {"program", "freedom", "believe", "thought", "company",
                "love", "student", "teacher", "chair", "culture"};
        Random random = new Random();
        int idx = random.nextInt(words.length);
        String word = words[idx];

        char[] guesstedWord = makeUnderLine(word.length());  // 문자길이의 맞게 _ 출력

        int attempts = word.length() + 3; // 시도 횟수

        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("현재단어 : " + String.valueOf(guesstedWord)); // 값을 문자열로 변경
            System.out.println("남은 시도 회수 : " + attempts);

            // case 1)
            String str = "";
            while (true) {
                System.out.print("글자를 입력하세요 : ");
                str = scanner.nextLine();

                // 한글자 확인 and 영문자 입력
                if (str.length() == 1 && str.matches("[a-zA-Z]")) {
                    str = str.toLowerCase(); // 대문자 입력받으면 소문자로 변환
                    // 아니면 입력 받을 때 str = scanner.nextLine().toLowerCase();
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
    }

    public static char[] makeUnderLine(int len) {
        char[] underLine = new char[len];
        for (int i = 0; i < len; i++) {
            underLine[i] = '_';
        }
        return underLine;
    }
}
