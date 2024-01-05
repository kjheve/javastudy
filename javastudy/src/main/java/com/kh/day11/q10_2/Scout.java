package com.kh.day11.q10_2;

public class Scout {
    private String name; // 이름
    private int boxesSold; // 판매한 과자 상자 수

    public Scout(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 판매한 과자 상자 수 만큼 +
    public void updateSales(int num) {
        boxesSold += num;
    }

    @Override
    public String toString() {
        return "단원 이름 : " + name + " 판매한 과자 상자 수 : " + boxesSold;
    }
}
