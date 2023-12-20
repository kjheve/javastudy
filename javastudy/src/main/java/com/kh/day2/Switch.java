package com.kh.day2;

public class Switch {
    public static void main(String[] args) {
        int number = 4;
        switch (number) { // switch(정수, 문자열, 열거형(enum)) 실수(x)
            case 1:
                System.out.println(1);
                break; // switch문을 빠져나온다.
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default: // 일치하는 위치값이 없을 때 이 위치로 이동
                System.out.println("etc");
        }
    }
}
