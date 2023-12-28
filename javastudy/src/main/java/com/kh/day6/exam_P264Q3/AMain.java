package com.kh.day6.exam_P264Q3;

public class AMain {
    public static void main(String[] args) {
        A a = new A();
        int[] data1 = new int[]{1, 2, 3};
        int[] data2 = {4, 5, 6};

        System.out.println(a.arraySum(data1));
        System.out.println(a.arraySum(data2));
        System.out.println(a.arraySum(new int[] {1, 2, 3}));
//        System.out.println(a.arraySum({1, 2, 3})); // 오류발생

//        int[] x = new int[]{1, 2, 3};
//
//        int[] x2;
//        x2 = new int[] {1, 2, 3};
//
//        int[] y = {1, 2, 3};
//        y = {1, 2, 3}; // 분리 안됨


    }
}
