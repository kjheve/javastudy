package com.kh.day9.exam1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        student.eat();
        student.study();

        HighStudent highStudent = new HighStudent();
        highStudent.eat();
        highStudent.study();
        highStudent.examEntrance();

        // 자동형변환(upcasting)
//            하위타입이 상위타입에 대입
        int x = 3;
        double y = x;
//        double y = (double) x;
        Person person2 = new Student();
//        Person person2 = (Person) new Student();
//
//         강제형변환(downcasting)
//         int z = (int) 3.14;
//        Student student1 = person2; // 에러발생
        Student student2 = (Student) person2;

        // 강제형 변환 유의점!
//        HighStudent highStudent2 = (HighStudent) student2;
//        highStudent2.examEntrance();


    }
}
