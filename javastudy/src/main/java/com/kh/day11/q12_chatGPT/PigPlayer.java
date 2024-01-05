package com.kh.day11.q12_chatGPT;

class PigPlayer {
    private int total;
    private int round;
    private final int limit;
    static final String ASK = "계속하시겠습니까? (y/n): ";

    public PigPlayer(int limit) {
        total = 0;
        round = 0;
        this.limit = limit;
    }

    public void roll(PairOfDice dice) {
        dice.roll();
        int rollTotal = dice.getTotal();

        if (rollTotal == 2) {
            round = 0;
            System.out.println("뱀의 눈! 현재라운드 초기화");
        } else if (dice.getDie1() == 1 || dice.getDie2() == 1) {
            round = 0;
            System.out.println("주사위 중 하나가 1이 나왔습니다, 현재라운드 점수 초기화");
        } else {
            round += rollTotal;
        }

        System.out.println("주사위를 굴렸습니다 : " + dice.getDie1() + " and " + dice.getDie2());
        System.out.println("현재라운드 점수 : " + round);
    }

    public int getRound() {
        return round;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
