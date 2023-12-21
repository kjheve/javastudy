package com.kh.day1;
    //　실행　클래스　：　ｍａｉｎ메소드가　있는　클래스
    //　라이브러리　클래스　：　ｍａｉｎ메소드가　없는　클래스　
public class Method {
    // Method
    // 실행 메소드 : 메소드 이름이 main
    public static void main(String[] args) {
        System.out.println("1");
        int x = 10, y = 20;
        int sum = x + y;
        System.out.println("sum=" + sum);

        x = 100;
        y = 200;
        sum = sum(x, y);
        System.out.println("sum=" + sum);

        x = 300;
        y = 400;
        sum = sum(x, y);
        System.out.println("sum=" + sum);
    }
    // Method
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
