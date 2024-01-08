package com.kh.day12.q8_Sol;

import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookCatalogue bcat = new BookCatalogue(); // 책꽂이 생성

        boolean flag = false;


        while (!flag){
            System.out.print("도서명 : ");
            String bookName = scanner.nextLine();
            System.out.print("저자 : ");
            String bookAutor = scanner.nextLine();
            System.out.print("가격 : ");
            int bookPrice = scanner.nextInt();
            scanner.nextLine();

            // 값을 입력받아서 책을 생성
            Book book = new Book(bookName, bookAutor, bookPrice);
            System.out.println("도서가 추가되었습니다.");

            // 책을 책꽂이에 꽂기
            bcat.addTocatalogue(book);

            System.out.print("도서를 추가하겠습니까?(y/n) : ");
            String go = scanner.nextLine();
            if (!go.equalsIgnoreCase("Y")) {
                flag = true;
            }
        }

        // 도서목록 출력
        System.out.println(bcat);
//        for(Book book : bcat.getCatalogue()) {
//            System.out.println(book);
//        }

    }
}
