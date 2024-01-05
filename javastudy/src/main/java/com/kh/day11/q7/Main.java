package com.kh.day11.q7;

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("coin = " + coin.getFace());
        coin.flip();
        System.out.println("coin = " + coin.getFace());
        System.out.println("현재 동전은 " + coin);
    }
}
