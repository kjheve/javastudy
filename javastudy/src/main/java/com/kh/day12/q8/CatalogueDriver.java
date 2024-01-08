package com.kh.day12.q8;

import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        BookCatalogue bcat = new BookCatalogue(10);

        while (!stop) {
            System.out.println("도서를 추가하시겠습니까? (예/아무거나) ");
            String flag = scanner.nextLine();
            if (flag.equals("예")) {
                System.out.print("도서명 입력 : ");
                String bookName = scanner.nextLine();
                System.out.print("저자 입력 : ");
                String bookAuthor = scanner.nextLine();
                System.out.print("책가격 입력 : ");
                int bookPrice = scanner.nextInt();
                bcat.addToCatologue(bookName, bookAuthor, bookPrice);
            } else {
                stop = true;
            }
        }

        System.out.println(bcat.toString());

    }
}
