package com.kh.day13.q9_2;

import java.util.Arrays;

public class ShoppingCart {
    private Item[] cart;     // Item 객체들의 배열
    private final int CAPACITY;    // 장바구니의 최대 크기
    private int itemCount;   // 장바구니에 있는 Item 객체들의 총수
    private int totalPrice;  // 장바구니에 있는 상품들의 총 가격

    public ShoppingCart() {
        CAPACITY = 5;
        cart = new Item[CAPACITY];
    }

    // 장바구니에 한 Item 객체를 추가한다.
    public void addToCart(Item item) {
        cart[itemCount++] = item;
        totalPrice += item.getPrice() * item.getQuantity();
    }

    // 장바구니에 상태를 문자열로 반환한다


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cart=" + Arrays.toString(cart) +
                ", CAPACITY=" + CAPACITY +
                ", itemCount=" + itemCount +
                ", totalPrice=" + totalPrice +
                '}';
    }

    // 장바구니에 있는 상품들의 총 가격을 반환한다.
    public int getTotalPrice() {
        return totalPrice;
    }
}
