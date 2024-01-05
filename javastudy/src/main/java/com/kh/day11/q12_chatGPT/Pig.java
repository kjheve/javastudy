package com.kh.day11.q12_chatGPT;

import java.util.Scanner;

class Pig {
    private final int goal;
    private final PairOfDice dice;
    private final PigPlayer computer;
    private final PigPlayer human;
    private PigPlayer currentPlayer;

    public Pig(int goal) {
        this.goal = goal;
        dice = new PairOfDice();
        computer = new PigPlayer(20);
        human = new PigPlayer(20);
        currentPlayer = human;
    }

    public void play() {
        while (true) {
            takeTurn();
            if (currentPlayer.getTotal() >= goal) {
                announceWinner();
                break;
            }
            switchPlayer();
        }
    }

    private void takeTurn() {
        System.out.println(">>> " + (currentPlayer == human ? "당신의" : "컴퓨터의") + " 턴 <<<");

        if (currentPlayer == human) {
            Scanner scanner = new Scanner(System.in);
            String response;

            do {
                currentPlayer.roll(dice);
                if (currentPlayer.getTotal() + currentPlayer.getRound() >= goal) {
                    announceWinner();
                    System.exit(0);
                }

                if (currentPlayer.getRound() == 0) {
                    break;
                }

                System.out.print(PigPlayer.ASK);
                response = scanner.nextLine();
            } while (response.equalsIgnoreCase("y"));
        } else {
            while (currentPlayer.getRound() < currentPlayer.getLimit() && currentPlayer.getTotal() + currentPlayer.getRound() < goal) {
                currentPlayer.roll(dice);
            }
        }

        currentPlayer.setTotal(currentPlayer.getTotal() + currentPlayer.getRound());
        System.out.println(currentPlayer == human ? "--- 당신의" : "--- 컴퓨터의" + " 총점수 : " + currentPlayer.getTotal());
        currentPlayer.setRound(0);
    }

    private void announceWinner() {
        System.out.println((currentPlayer == human ? "=]:> 당신" : "=]:> 컴퓨터") + " 가 이겼습니다! <:[=");
        System.out.println("게임 종료");
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == human) ? computer : human;
    }

    public static void main(String[] args) {
        Pig pigGame = new Pig(100);
        pigGame.play();
    }
}
