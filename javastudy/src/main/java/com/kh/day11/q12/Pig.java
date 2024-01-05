package com.kh.day11.q12;

public class Pig {
    private int goal;          // 목표 점수
    private PairOfDice dice;          // 주사위 쌍 객체
    private PigPlayer computer;      // 컴퓨터 선수
    private PigPlayer human;         // 사용자 선수
    private PigPlayer currentPlayer; // 현 선수

    // 생성자 메소드: 목표 점수를 포함하여 게임 시작 전에 초기화한다
    public Pig(int goal) {
        this.goal = goal;
        dice = new PairOfDice(); // 주사위들 초기화
        computer = new PigPlayer(20); // 최대 획득 점수 : 20
        human = new PigPlayer(PigPlayer.ASK); // 사용자는 회차종료상태
    }

    // play: 한 선수가 이길 때까지 게임을 반복한다
    public void play() {
        currentPlayer = computer;

        boolean stop = false;
        while (!stop) {
            takeTurn();
            if(currentPlayer.getTotal() >= goal) {
                stop = true;
            } else { // 차례 변경
                if (currentPlayer == computer) {
                    currentPlayer = human;
                } else {
                    currentPlayer = computer;
                }
            }
        }

    }

    // takeTurn: 한 선수의 순서에 대한 게임을 한다
    public void takeTurn() {
        if(currentPlayer == computer) {
            System.out.println(">> 컴퓨터 차례 <<");
        } else {
            System.out.println(">> 당신의 차례 <<");
        }
        System.out.println("현재 점수");
        System.out.println("computer : " + computer.getTotal());
        System.out.println("human : " + human.getTotal());
        currentPlayer.roll(dice, goal);
    }

// announceWinner: 승자를 발표하고 결과를 출력한다
    public void announceWinner() {
        if (currentPlayer == computer) {
            System.out.println("computer win!!");
        } else {
            System.out.println("human win!!");
        }
        System.out.println("최종결과");
        System.out.println("com : " + computer.getTotal() +
        "human : " + human.getTotal());
    }

// main: Pig 객체를 생성하여 게임을 한다
    public static void main(String[] args) {
        Pig pig = new Pig(50); // 목표 점수 50인 게임 시작
        pig.play();

    }
}
