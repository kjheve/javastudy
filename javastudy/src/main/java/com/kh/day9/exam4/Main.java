package com.kh.day9.exam4;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.staticField = "ㅋ";
        parent.staticField = "이건 권장하지않음";
        Child child = new Child();
        



    }
}
