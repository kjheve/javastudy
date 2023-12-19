package com.kh.day1;

// 지역 변수의 생명주기 : 변수가 선언된 블럭내에서 유효하다
public class Variable2 {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;
        System.out.println("y = " + y);
        
        // int x; 변수 선언 불가능!
        {
            int z = 30;
            System.out.println("y = " + y);
            System.out.println("z = " + z);
            {
                System.out.println("x = " + x);
            }
        }
        int z = 10; // 변수 선언 가능!
        System.out.println("z = " + z);
    }
}
