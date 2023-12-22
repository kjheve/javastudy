package com.kh.day4;

// Question3 이후

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for-each문
//        for( 요소 : 배열 or 컬렉션 ) {
//         실행구문
//        }
        for (int ele : numbers) {
            System.out.println(ele);
        }
    }
}
