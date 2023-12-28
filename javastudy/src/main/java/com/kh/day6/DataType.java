package com.kh.day6;

public class DataType {
    public static void main(String[] args) {
        byte x = -128; // -128 ~ 127
//        x = -129; // 에러발생
//        char c = -65; // 음수는 담을 수 없음 0~65535
        for (int i = 65; i < 91; i++) { // A~Z까지 아스키코드(65~90)
            System.out.print((char)i);
        }
        short s = -32768; // -32768 ~ 32767
        int i = -2_147_483_648; // -2,147,483,648 ~ 2,147,483,647
        long l = -92_223_327_036_854_808L;
        
//        switch문에 정수는 올 수 있지만 long 타입은 제외
//        long l2 = 1L;
//        switch (l2) {
//        }
    }
}