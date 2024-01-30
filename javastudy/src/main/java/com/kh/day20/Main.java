// 자바 스크립트
// 전역객체 이해하기

package com.kh.day20;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setCal(new Calc());
        double value = p.getCal().add(1, 2);
        System.out.println(value);

        value = p.cal.add(10, 2);
        System.out.println(value);

        p.car.run();

        int lifeSpan = p.car.tire.lifeSpan;
        p.car.tire.wearDown();



        Calc cal = new Calc();
        Person p2 = new Person(cal);
        p2.smile();
        p2.eat();

        cal.add(1, 2);

    }
}
