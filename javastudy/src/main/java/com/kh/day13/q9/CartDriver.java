package com.kh.day13.q9;

import java.util.Scanner;

public class CartDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart scart = new ShoppingCart();
        String itemName; // 구매하는 상품의 이름
        int itemPrice; // 구매하는 상품의 가격
        int itemQuantity; // 구매하는 상품의 수량

        String addItem = ""; // flag


        while (!addItem.equalsIgnoreCase("N")) {
            System.out.println("구매 물품의 정보를 입력 하세요");
            System.out.print("상품 이름 >> ");
            itemName = scanner.nextLine();
            System.out.print("가격 >> ");
            itemPrice = Integer.parseInt(scanner.nextLine());
            System.out.print("수량 >> ");
            itemQuantity = Integer.parseInt(scanner.nextLine());

            scart.addToCart(itemName, itemPrice, itemQuantity);

            System.out.print("더 구매하시겠습니까? (Y/N) >> ");
            addItem = scanner.nextLine();
        }
        System.out.println(scart);
        System.out.println("총 결제액 : " + scart.getTotalPrice());
    }
}
