package com.kh.day11.q12;

import java.util.Scanner;

public class PigPlayer { // 컴퓨터일 수도 있고 사람일 수도 있음
    private int total; // 게임에서 얻은 총 점수
    private int round; // 현 회차에서 얻은 점수
    private int limit; // 한 회차에서 얻을 수 있는 최대 점수
    public static final int ASK = -1; // 회차 종료를 위한 메시지

    // 생성자 메소드: 점수들을 0으로 초기화하고 최대 획득 점수를 주어진 값으로 한다
    public PigPlayer(int limit) {
        this.limit = limit;
    }

    //  roll: 주사위 쌍을 던지고 결과를 다룬다
    public void roll(PairOfDice pairOfDice, int goal) {
        
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        
        while (!stop) {
            pairOfDice.roll(); // Player가 주사위 2개를 굴리는 행위를 요청 하면
            int die1 = pairOfDice.getDie1().getFaceValue(); // 첫번째 주사위의 눈
            int die2 = pairOfDice.getDie2().getFaceValue(); // 두번째 주사위의 눈
            System.out.println("주사위 눈 : (" + die1 + ", " + die2 + ")"); // 값 확인

            // 2. 두개 주사위 중 1개라도 1이 나오면 현 회차 점수를 초기화 후 차례를 넘긴다.
            if (die1 == 1 || die2 == 1) {
                System.out.println("현 회차에서 얻은 점수가 초기화 됩니다.");
                System.out.println("차례를 넘깁니다.");
                round = 0;
                // 3. 두개 주사위 모두 1이 나오면 현 회차 및 총 점수를 초기화후 차례를 넘긴다.
                if (die1 == 1 && die2 == 1) {
                    System.out.println("총 점수가 초기화 됩니다.");
                    total = 0;
                }
                return;
            }
            // 주사위 두 눈의 수 합
            round = die1 + die2;

            // 목표 점수를 먼저 획득한 선수가 승리한다.
            if((total + round) >= goal) {
                stop = true;
            } else {
                // human인 경우
                if(limit == ASK) {
                    System.out.print("계속 던진시겠습니까?(y/n) : ");
                    String again = scanner.nextLine();
                    if(!again.equalsIgnoreCase("Y")) {
                        stop = true;
                    }
                } else { // computer인 경우
                    if (round >= limit) {
                        stop = true;
                    }
                }
            }

            total += round; // 한회차의 수를 총 점수에 누적
            round = 0;

        }
    }

    //  getPoints: 선수가 얻은 총점을 반환한다
    public int getTotal() {
        return total;
    }
}
