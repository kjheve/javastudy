package com.kh.day11.q10;

import java.util.Scanner;

public class ScoutDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saleweeks = 3; // 판매기간
        Scout[] gscout = new Scout[3];
        for (int i = 0; i < gscout.length; i++) {
            gscout[i] = new Scout("단원"+(i + 1));
        }

        for (int i = 0; i < gscout.length; i++) {
            for (int j = 0; j < saleweeks; j++) {
                System.out.print(gscout[i].getName() + "이 " + (j + 1) + "주째 판매량 : ");
                int saleperweek = scanner.nextInt();
                gscout[i].updateSales(saleperweek);
            }
            System.out.println("----------");
        }

        // Display results
        for (int i = 0; i < gscout.length; i++) {
            System.out.println(gscout[i].toString());
        }


    }
}
