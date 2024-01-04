package com.kh.day11.q10;

public class Scout {
    private String name; // 이름
    private int boxesSold; // 판매한 과자 상자 수

    public Scout(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int boxesSold) {
        this.boxesSold += boxesSold;
    }

    @Override
    public String toString() {
        return name + " / 판매 수 : " + boxesSold;
    }
}
