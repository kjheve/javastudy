package com.kh.day7.game;
// Question1_Sol_Upgrade.java를 class로 구현
public class Main {
    public static void main(String[] args) {
        String[] words = {"program", "freedom", "believe", "thought", "company",
                "love", "student", "teacher", "chair", "culture"};
        HangMan hangMan = new HangMan(words);
        hangMan.run();
    }
}
