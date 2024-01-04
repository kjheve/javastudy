package com.kh.day11.q14;

import com.kh.day11.q13.ItemSales;

public class ItemSalesDriver {
    public static void main(String[] args) {
        ItemSales lunchBoxSeller = new ItemSales(1000, 10, 3);

        // 도시락을 한 개를 판 내역을 출력
        System.out.println("도시락 1개를 판 내역:");
        lunchBoxSeller.registerSale(1);
        lunchBoxSeller.displaySales();
        System.out.println();

        // 도시락을 9개를 판 내역을 출력
        System.out.println("도시락 9개를 판 내역:");
        lunchBoxSeller.registerSale(9);
        lunchBoxSeller.displaySales();
        System.out.println();

        // 도시락을 10개를 판 내역을 출력
        System.out.println("도시락 10개를 판 내역:");
        lunchBoxSeller.registerSale(10);
        lunchBoxSeller.displaySales();
        System.out.println();

        // 도시락을 50개를 판 내역을 출력
        System.out.println("도시락 50개를 판 내역:");
        lunchBoxSeller.registerSale(50);
        lunchBoxSeller.displaySales();
        System.out.println();
    }
}