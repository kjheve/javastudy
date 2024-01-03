package com.kh.day10.exam_day9;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
//        if (age < 0) return;
//        if (age > 100) return;
        if (age < 1 || age > 100) return;
        this.age = age;
    }

    @Override
    public String toString() {
//        return super.toString();
        return this.name + " : " + this.age;
        // Alt + Insert로 재정의하면 아래처럼 나옴
        //        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
