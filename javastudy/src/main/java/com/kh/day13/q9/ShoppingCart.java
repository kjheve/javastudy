package com.kh.day13.q9;

import java.util.Arrays;

public class ShoppingCart {
    private Item[] cart; // Item 객체들의 배열
    private int capacity; // 장바구니의 최대 크기
    private int itemCount; // 장바구니에 있는 Item 객체들의 총수
    private int totalPrice; // 장바구니에 있는 상품들의 총 가격

    public ShoppingCart() {
        capacity = 5;
        cart = new Item[capacity];
    }

    public void addToCart(String itemName, int itemPrice, int itemQuantity) {
        Item item = new Item(itemName, itemPrice, itemQuantity);
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null){
                cart[i] = item;
                itemCount++; // 장바구니 Item 갯수 증가
                totalPrice += item.getPrice() * item.getQuantity(); // 총가격 업데이트
                System.out.println(item.getName() + " 상품을 담았습니다.");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "담은 아이템 : " + Arrays.toString(cart) +
                "\n장바구니 수 : " + itemCount + "\n";
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
