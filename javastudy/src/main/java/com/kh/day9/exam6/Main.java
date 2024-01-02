package com.kh.day9.exam6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();

//        System.out.println(person.name);
        
        Student student2 = new Student();
        student2.eat(); // 많이 먹다
        System.out.println(student2.name); // 고길동 

        Person person2 = (Person) student2;
        person2.eat(); // 많이 먹다
        System.out.println(person2.name); // 홍길동


    }
}
