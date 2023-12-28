package com.kh.day6;
// Method2와 비교
public class Method1 {
    public static void modifyValue(int value) {
        value = 100;
        System.out.println("modifyValue : " + value);
    }

    public static void main(String[] args) {
        int value = 50;
        System.out.println("modifyValue() 호출전 : " + value);

        modifyValue(value);
        System.out.println("modifyValue() 호출 후 : " + value); // 50
    }
}
