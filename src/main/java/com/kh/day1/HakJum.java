package com.kh.day1;

/*
    Q) 점수에 따른 수우미양가 평가
    90점 이상 - 수 / 80이상 90점 미만 - 우 / 70이상 80점 미만 - 미 /
    60점 이상 70점 미만 - 양 / 60점 미만 - 가
 */
public class HakJum {
    public static void main(String[] args) {
        int score = 75;

        boolean exp1 = score >= 90;
        boolean exp2 = score >= 80 && score < 90;
        boolean exp3 = score >= 70 && score < 80;
        boolean exp4 = score >= 60 && score < 70;

        // 다중 if문
        if(exp1) { // if(true)이면 {} 구문 출력, if(false)이면 다음 else if로 넘어감
            System.out.println("수");
        } else if (exp2) {
            System.out.println("우");
        } else if (exp3) {
            System.out.println("미");
        } else if (exp4) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }
    }
}
