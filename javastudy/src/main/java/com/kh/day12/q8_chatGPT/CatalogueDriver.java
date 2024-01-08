package com.kh.day12.q8_chatGPT;

import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수들
        BookCatalogue bcat;
        String bookName, bookAuthor;
        int bookPrice;
        String flag;

        // 알고리즘
        System.out.println("도서 추가를 시작합니다.");

        do {
            // BookCatalogue 객체 생성
            bcat = new BookCatalogue();

            do {
                // 도서명, 저자, 가격 입력
                System.out.print("도서명을 입력하세요: ");
                bookName = scanner.nextLine();
                System.out.print("저자를 입력하세요: ");
                bookAuthor = scanner.nextLine();
                System.out.print("가격을 입력하세요: ");
                bookPrice = Integer.parseInt(scanner.nextLine());

                // Book 객체 생성
                Book book = new Book(bookName, bookAuthor, bookPrice);

                // 도서목록에 도서 추가
                bcat.addToCatalogue(book);

                // 추가할 도서가 있는지 확인
                System.out.print("더 도서를 추가하시겠습니까? (예/아니오): ");
                flag = scanner.nextLine();
            } while (flag.equalsIgnoreCase("예"));

            // 도서목록 출력
            System.out.println(bcat);

            // 추가 도서목록이 있는지 확인
            System.out.print("새로운 도서목록을 추가하시겠습니까? (예/아니오): ");
            flag = scanner.nextLine();
        } while (flag.equalsIgnoreCase("예"));

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}