package com.kh.day2;

/*
    형변환
    - 자동형변환 : 작은 타입을 큰타입에 대입시 자동처리
    - 강제형변환 : 큰타입을 작은 타입으로 변경시 형변환 연산자 사용
 */
public class Casting {
    public static void main(String[] args) {
        System.out.println(3 / 2);
        System.out.println(3 / 2 * 1.0);

        System.out.println(3);
        System.out.println((double)3);

        System.out.println((double)3 / 2);
        System.out.println(3 / (double)2);

        // 자동형변환 : 작은 타입은 큰타입에 저장할 때 자동형변환 해줌
        int y = 10;
        double z = y;
        System.out.println("z = " + z);

        // 강제형변환 : 큰타입을 작은 타입으로 저장할 때 명시적으로 변환해야함
//        double i = 10;
//        int j = i;

        // 강제형변환
        double x = 3.14;
        int result = (int)x;
        System.out.println("result = " + result);

    }
}
