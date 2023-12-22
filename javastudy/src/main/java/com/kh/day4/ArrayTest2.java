package com.kh.day4;

// 변수 : 메모리상에 하나의 값을 저장할 수 있는 기억공간의 이름
//

public class ArrayTest2 {
    public static void main(String[] args) {
//        case 1)
//        int[] subjects;
//        subjects = new int[3];
//        case 2)
        int[] subjects = new int[3];

        for (int i = 0; i < subjects.length; i++) {
        System.out.println("subjects = " + subjects[i]);
        }
        
        System.out.println("-------재할당 후--------");
        // 배열 요소에 값 재할당
        subjects[0] = 10;
        subjects[1] = 20;
        subjects[2] = 30;

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("subjects = " + subjects[i]);
        }
        System.out.println();

    }
}
