package com.kh.day8.exam3_inherit;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.smile();

        Student student = new Student();
        student.eat();
        student.smile();
        student.study();

        HighStudent highStudent = new HighStudent();
        highStudent.eat();
        highStudent.smile();
        highStudent.study();
        highStudent.examEntrance();

        // 참조타입에서의 형변환
        Student student2 = (Student)highStudent; // Down 캐스팅
        student2.number = 20231229;
        HighStudent highStudent2 = (HighStudent)student2; // Upper 캐스팅
        highStudent2.examEntrance();

//        HighStudent highStudent3 = (HighStudent)student; // 중학생이 고딩 넘보면
//        highStudent3.exam(); // 문법상으로는 문제가 없는데...
        // 컴파일시에는 오류가 없으나 런타임시에 캐스팅 예외 발생
    }
}
