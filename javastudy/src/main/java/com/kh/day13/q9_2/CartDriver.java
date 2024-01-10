package com.kh.day13.q9_2;

import java.util.Scanner;

public class CartDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart scart = new ShoppingCart(); // scart : ShoppingCart 객체

        String itemName = null; // 구매하는 상품의 이름
        int itemPrice = 0; // 구매하는 상품의 가격
        int itemQuantity = 0; // 구매하는 상품의 수량

        boolean flag = false; // 상품 추가 여부 확인


        while (!false) {
            System.out.println("구매 물품의 정보를 입력 하세요");
            System.out.print("상품명 >> ");
            itemName = scanner.nextLine();
            System.out.print("가격 >> ");
            itemPrice = Integer.parseInt(scanner.nextLine());
            System.out.print("수량 >> ");
            itemQuantity = Integer.parseInt(scanner.nextLine());

            // 장바구니에 입력 받은 상품을 추가한다.
            scart.addToCart(new Item(itemName, itemPrice, itemQuantity));

            // 추가할 상품이 있는지 요청하고 사용자 입력 값을 flag에 저장한다.
            System.out.print("더 구매하시겠습니까? (예/아니오) >> ");
            String answer = scanner.nextLine();
            if(!answer.equalsIgnoreCase("예")) {
                flag = true;
                break;
            }
        }
        System.out.println("총 결제액 : " + scart.getTotalPrice());
    }
}
