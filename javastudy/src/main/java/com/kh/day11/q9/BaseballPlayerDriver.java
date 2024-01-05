package com.kh.day11.q9;

public class BaseballPlayerDriver {
    public static void main(String[] args) {
        String bpname; // 입력받은 선수 이름
        int bpposition; // 입력받은 선수 위치
        int noHits; // 입력받은 안타수
        int noWalks; // 입력받은 선수 4구수
        int sumHits; // 선수들의 안타수 합
        int sumWalks; // 선수들의 4구수 합

        BaseballPlayer[] bp = new BaseballPlayer[9];
        for (int i = 0; i < bp.length; i++) {
            bp[i] = new BaseballPlayer(i+"번째 타자");
        }
        /*
        - 알고리즘
        1. 9명의 선수들의 이름, 위치, 안타수와 4구수를 입력받는다.
        2. 9명의 선수들의 이름, 위치, 안타수와 4구수를 모범출력에 주어진 포맷에 따라 출력한다.
        3. 9명의 선수들의 안타수들의 합과 4구수들의 합을 구하여 출력한다.
         */

    }
}
