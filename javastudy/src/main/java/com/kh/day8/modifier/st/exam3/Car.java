package com.kh.day8.modifier.st.exam3;
/*
    static 메소드는 : static 멤버 (필드, 메소드)만 접근 가능
 */
public class Car {
    private static String model = "테슬라";
    private String color;
    private int speed;
    private static int totalCnt; // 생성된 테슬라 대수 카운트
    private final static int MAX_SPEED = 300;

    private Car() {
        totalCnt++;
    }
    Car(String color) {
        this();
        this.color = color;
    }

    void speedUp() { // 속도를 내다
        if(this.speed == MAX_SPEED) {
            return;
        }
        speed++;
    }
    void speedDown() { // 속도를 줄이다.
        if(this.speed < 0) {
            return;
        }
        speed--;
    }

    // 현재 속도 확인
    int getSpeed() {
        return speed;
    }

    // 총 생산량
    public static int getTotalCnt() {
        return totalCnt;
    }
    // 색상 수정
    void setColor(String color) {
        this.color = color;
    }
    // 색상
    String getColor() {
        return color;
    }
    // 최대 속도
    static int getMaxSpeed() {
        return MAX_SPEED;
    }
    // 차 모델
    static String getModel() {
        return model;
    }
}
