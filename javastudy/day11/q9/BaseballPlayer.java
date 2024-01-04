package com.kh.day11.q9;

public class BaseballPlayer {
    private String name; // 야구선수의 이름
    private int position; // 야구선수의 위치
    private int numHits; // 야구선수의 안타수
    private int numWalks; // 야구선수의 4구수

    BaseballPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumHits() {
        return numHits;
    }

    public void setNumHits(int numHits) {
        this.numHits = numHits;
    }

    public int getNumWalks() {
        return numWalks;
    }

    public void setNumWalks(int numWalks) {
        this.numWalks = numWalks;
    }
}
