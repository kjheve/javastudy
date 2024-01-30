package com.kh.day20;

public class Person {
    private String name;
    private int age;
    Calc cal;
    Car car;

    public Person() {
    }

    public Person(Calc cal) {
        this.cal = cal;
    }

    public void smile() {}
    public void eat() {}

    public void setCal(Calc cal) {
        this.cal = cal;
    }
    public Calc getCal() {
        return cal;
    }
}
