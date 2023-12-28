package com.kh.day6.exam2;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println("색상 : " + c1.color);
        System.out.println("속도 : " + c1.speed);

        c1.color = "빨강";
        System.out.println("색상 : " + c1.color);
        System.out.println("속도 : " + c1.speed);

        c1.start();
        c1.run();
        c1.stop();
        c1.turnOffCar();

        Car c2 = new Car("검정");
        System.out.println("색상 : " + c2.color);
        System.out.println("속도 : " + c2.speed);

        c2.start();
        c2.run();
        c2.stop();
        c2.turnOffCar();

    }
}
