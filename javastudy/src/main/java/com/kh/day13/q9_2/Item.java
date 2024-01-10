package com.kh.day13.q9_2;

public class Item {
    private String name;      // 상품의 이름
    private int price;        // 상품의 가격
    private int quantity;     // 상품의 수량

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\n상품 이름 : " + name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}
