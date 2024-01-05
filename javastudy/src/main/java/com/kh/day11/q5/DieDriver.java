package com.kh.day11.q5;

public class DieDriver {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();

        int cnt = 0;

        for (int i = 0; i < 100; i++) {
            int face1 = d1.roll();
            int face2 = d2.roll();
            int sum = face1 + face2;
            if (sum == 7 || sum == 11){
                cnt++;
            }
        }
        System.out.println("100번 돌릴동안 두 주사위 합이 7이나 11인 경우 : ");
        System.out.println(cnt + "번");
    }
}
