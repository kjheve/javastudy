package com.kh.day11.q12_chatGPT;

import com.kh.day11.q5_2.Die;

class PairOfDice {
    private Die die1;
    private Die die2;
    private int value1;
    private int value2;
    private int total;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
        roll();
    }

    public void roll() {
        value1 = die1.roll();
        value2 = die2.roll();
        total = value1 + value2;
    }

    public int getTotal() {
        return total;
    }

    public int getDie1() {
        return value1;
    }

    public int getDie2() {
        return value2;
    }
}
