package com.kh.day11.q7;

import java.util.Random;

public class Coin {
    private static final int HEADS = 1; // 동전의 앞면
    private static final int TAILS = 2; // 동전의 뒷면
    int face; // 동전의 현재면
    private Random random = new Random();
    public Coin(){
        super();
        flip();
    }

    public int flip() {
        face = random.nextInt(2)+1;
        return face;
    }

    public int getFace() {
        return face;
    }

    @Override
    public String toString() {
//        String str = "";
//        if (face == 1) {
//            str = "앞면";
//        } else {
//            str = "뒷면";
//        }
//        return str;
        return (face == HEADS) ? "앞면" : "뒷면";
    }
}
