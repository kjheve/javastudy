package com.kh.day10.exam1;

public class Zoo {
    Animal[] animals;
    private int index; // 배열을 몇번째에 저장할지

    Zoo(int size) { // 생성자로 배열의 크기 받기
        this.animals = new Animal[size];
    }

    void addAnimal(Animal animal) { // 동물 추가 하는 메소드
        animals[index++] = animal;
    }

    void makeAnimalsHowl() { // 동물들이 소리내게 하기
        for (Animal i : animals) {
            i.howl();
        }
    }

}
