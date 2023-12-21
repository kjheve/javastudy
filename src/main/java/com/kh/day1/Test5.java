package com.kh.day1;

// 비교연산자 : 같다, 다르다, 크다, 작다, 크거나작다, 작거나같다
//             == ,  != ,   >  ,  <  ,  >=    ,   <=

public class Test5 {
    public static void main(String[] args) {
        int number = 6;
        int mod = number % 2;
        System.out.println("나머지 " + mod);
        if (mod == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
