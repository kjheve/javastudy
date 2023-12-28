package com.kh.day6.exam2;

public class Car {
    // ---------- 속성 ---
    String color; // 색상
    int speed; // 속도

    //생성자
    Car() {
        super();
        System.out.println("Car 생성자호출");
    }
    Car(String color) {
        this(10);
        this.color = color;
    }
    Car(int speed) {
        this.speed = speed;
    }

    // ---------- 행위 ---
    void run() { // 달린다.
    System.out.println(this.color + " 달리다");
    }
    void start() { // 출발하다
        System.out.println(this.color + " 출발하다");
    }
    void stop() { // 멈추다
        System.out.println(this.color + " 멈추다");
    }
    void startCar() { // 시동걸다
        System.out.println(this.color + " 시동 걸다");
    }
    void turnOffCar() { // 시동끄다
        System.out.println(this.color + " 시동 끄다");
    }
}
