package com.kh.day8.modifier.st.exam2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        Car car = new Car();
//        person.drive(); // 차가 없는데 운전을하면 에러 표시
        person.setCar(car); // 요 때 person이 차를 갖게 됨

        Car car2 = new Car();
        person.setCar(car2); // 다른 차도 갖게됨
        person.drive();
    }
}
