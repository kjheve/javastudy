package com.kh.day11.q5;

import java.util.Random;

public class Die {
    private int faceValue;

    Random random = new Random();

    Die() {
        super();
    }

    public int roll() {
        return faceValue = random.nextInt(6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
