package com.kh.day4;

import java.util.Random;

/*
    아래를 참조하여 2차원 비정방행열로 초기화하고

    송명성 박준혁
    김동환 최은석 이나영
    윤경란 최정민 윤다영 김대군
    김동회 정소라 조승민 김재현

    두구두구두~
    반장 : (랜덤1명)
    부반장 : (랜덤1명)

    * 힌트 : [랜덤값1][랜덤값2]
    * 조건 : 반장, 부반장 중복 금지
 */
public class Question4_Sol {
    public static void main(String[] args) {
        String[][] students = {
                {"송명성", "박준혁"},
                {"김동환", "최은석", "이나영"},
                {"윤경란", "최정민", "윤다영", "김대군"},
                {"김동회", "정소라", "조승민", "김재현"}
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("두구두구두~");

        Random random = new Random();

        // 반장
        int rowNum = random.nextInt(students.length); // 0 ~ 3
        int colNum = random.nextInt(students[rowNum].length); // 0일 때 2, 1일 때 3, 2일 때 3, 3일 때 3
        System.out.println("반장[" + rowNum + "][" + colNum + "] : " + students[rowNum][colNum]);

        // 부반장
        while (true) {
            int rowNumSub = random.nextInt(students.length);
            int colNumSub = random.nextInt(students[rowNumSub].length);

            // 반장이름 != 부반장 일 때 빠져나옴
            if (!students[rowNum][colNum].equals(students[rowNumSub][colNumSub])) {
                System.out.println("부반장[" + rowNumSub + "][" + colNumSub + "] : " + students[rowNumSub][colNumSub]);
                break;
            }
        }
    }
}