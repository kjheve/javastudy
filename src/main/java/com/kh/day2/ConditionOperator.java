package com.kh.day2;

public class ConditionOperator {
    public static void main(String[] args) {
        int num = 2;

        // case 1)
        if(num % 3 == 0) {
            System.out.println("3의 배수");
        } else if(num % 2 == 0) {
            System.out.println("2의 배수");
        } else {
            System.out.println("기타");
        }

        // case 2) 삼항연산자 = (조건) ? 참 : 거짓
//        String result = num % 2 == 0 ? "짝수" : "홀수";
//        System.out.println(result);
        String result2 = num % 3 == 0 ? "3의 배수" : (num % 2 == 0 ? "2의배수" : "기타");
        System.out.println(result2);
    }
}
