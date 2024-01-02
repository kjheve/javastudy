package com.kh.day8.bookP303.q6;

/*
    인스턴스 필드의 초기화 : 생성자
    static 필드의 초기화 : static 블록

    static 블럭 : static 필드를 초기화
                 (초기화를 복잡하게 해야할경우)
 */
public class A {
    static String a;

    static {
        String[] strs = { "a", "b", "c"};
        int idx = (int)(Math.random() * strs.length); // 0~2까지 랜덤수
        a = strs[idx];
    }


}
