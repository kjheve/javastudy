package com.kh.day9.exam3;
/*
    instanceof : 실제 인스턴스의 타입을 알고자할 때 사용하는 연산자
        인스턴스 instanceof 타입 => 평과결과는 논리값
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Flyable bird2 = new Bird();
        bird2.fly();

        Airplane airplane = new Airplane();
        airplane.fly();

        Flyable airplane2 = new Airplane();
        airplane2.fly();

        fly(bird);
        fly(bird2);
        fly(airplane);
        fly(airplane2);
        fly(new Bird());
        fly(new Airplane());


    }

    public static void fly(Flyable flyable) {
        flyable.fly();
        if (flyable instanceof Bird) {
            Bird b = (Bird) flyable;
            b.eat();
        } else // flyable instanceof Airplane
        {
            Airplane a = (Airplane) flyable;
            a.fillOil();
        }
    }
}
