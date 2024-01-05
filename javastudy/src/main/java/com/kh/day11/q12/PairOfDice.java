package com.kh.day11.q12;

import com.kh.day11.q5_2.Die;

public class PairOfDice {
    private Die die1;
    private Die die2;
    private int value1, value2, total;
    //       / 1, 2번째 주사위숫자 / 주사위들의 합


    // 생성자 메소드 : 두 개의 주사위 객체들을 생성
    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }
    // 주사위 두 개를 던지고 숫자들의 합을 반환한다
    public int roll() {
        value1 = die1.roll();
        value2 = die2.roll();
        total = value1 + value2;
        return total;
    }

    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    public int getTotal() {
        return total;
    }
}
