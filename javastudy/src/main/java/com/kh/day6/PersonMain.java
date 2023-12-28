package com.kh.day6;
/*
    표준 클래스 -> 표준 라이브러리 (ex. Scanner, Random)
    사용자 정의 클래스 -> 사용자 정의 라이브러리
    제3자가 정의한 클래스 -> 3rd party 라이브러리 (유료, 무료) Third Party 라이브러리

 */
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(); // 실체화, 인스턴스화
        person.name = "홍길동";
        person.age = 30;

        System.out.println(person);

        person.smile();
        person.eat();

        Person person2 = new Person();
        person2.name = "고길동";
        person2.age = 20;

//        System.out.println(person2);

        person2.smile();
        person2.eat();

        Person[] persons = new Person[2];
        persons[0] = person;
        persons[1] = person2;

        for (int i = 0; i < persons.length; i++) {
            persons[i].smile();
        }
        for (Person p : persons) {
            p.eat();
        }

//        System.out.println(persons[0]);
//        System.out.println(persons[1]);

    }
}