package com.kh.day11.q10_2;

import java.util.Scanner;

public class ScoutDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 걸스카우트 3명 생성
        Scout[] gscout = new Scout[3];
        for (int i = 0; i < gscout.length; i++) {
            System.out.print("걸스카우트 (" + (i + 1) + ")번째의 이름을 입력하세요 : ");
            String gscoutname = scanner.nextLine();
            gscout[i] = new Scout(gscoutname);
        }

        // 과자 판매기간 : 단위(주)
        System.out.print("판매기간(주)를 입력하세요 : ");
        int saleweeks = scanner.nextInt();
        scanner.nextLine(); // "\n" 엔터키 읽어들임

        // 주별 판매수량 입력하기
        for (int i = 0; i < saleweeks; i++) {
            for (int j = 0; j < gscout.length; j++) {
                System.out.print(gscout[j].getName() + "의 " + (i + 1) + "주 판매갯수 : ");
                int saleperweek = scanner.nextInt();
                scanner.nextLine(); // "\n" 엔터키 읽어들임
                gscout[j].updateSales(saleperweek);
            }
        }
        for (int i = 0; i < gscout.length; i++) {
            System.out.println(gscout[i]);
        }
//        for (Scout scout : gscout) {
//            System.out.println(scout);
//        }
    }
}
