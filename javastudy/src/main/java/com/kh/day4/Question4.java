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
public class Question4 {
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

        Random random = new Random();

        int raw = random.nextInt(4);
        int column = random.nextInt(4);


        if (raw == 0 && column > 2) {
            // column 다시 돌리기
        }



//        boolean stop = false;
//        while (!stop) {
//            if (students[raw][column].equals("null")) {
//                column = random.nextInt(4) + 1;
//                continue;
//            }
//            stop = true;
//        }
//
//        String boss = students[raw][column];
//        String subBoss = students[raw][column];
//        System.out.println("반장 = " + boss);
    }
}
