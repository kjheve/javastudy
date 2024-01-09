package com.kh.day12.q8_up;
/*
    메뉴 : 도서 / 추가(1) / 삭제(2) / 가격수정(3) / 1권조회(4) / 전체조회(5) / 종료(6)
    선택 >> 2
    도서명 : 도서명1
    도서명1가 제거되었습니다 or 찾고자하는 도서가 없습니다.
    선택 >> 3
    도서명 : 도서명2
    현재가격 : 10000
    수정가격 : 12000
    도서명2의 가격이 수정되었습니다.
    선택 >> 4
    도서명 : 도서명3
    도서명 : 도서명3, 저자 : 저자3, 가격 : 20000
    선택 >> 5
    도서명 : 도서명1, 저자 : 저자1, 가격 : 10000
    도서명 : 도서명2, 저자 : 저자2, 가격 : 12000
    도서명 : 도서명3, 저자 : 저자3, 가격 : 20000
 */

import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookCatalogue bcat = new BookCatalogue(); // 책꽂이 생성

        String bookName, bookAutor = null;
        int bookPrice = 0;

        boolean flag = false;
        while (!flag) {
            System.out.println("도서 / 추가(1) / 삭제(2) / 가격수정(3) / 1권조회(4) / 전체조회(5) / 종료(6)");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    System.out.print("저자 : ");
                    bookAutor = scanner.nextLine();
                    System.out.print("가격 : ");
                    bookPrice = scanner.nextInt();
                    scanner.nextLine();
                    bcat.addTocatalogue(bookName, bookAutor, bookPrice);
                    break;
                case 2:
                    System.out.print("삭제 할 책 이름을 입력 : ");
                    bookName = scanner.nextLine();
                    bcat.delTocatalogue(bookName);
                    break;
                case 3:
                    System.out.print("수정 할 책 이름을 입력 : ");
                    bookName = scanner.nextLine();
                    System.out.print("수정 할 책 가격 입력 : ");
                    bookPrice = scanner.nextInt();
                    scanner.nextLine();
                    bcat.changeBookPrice(bookName, bookPrice);
                    break;
                case 4:
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    bcat.findBook(bookName);
                    break;
                case 5:
                    bcat.listBook();
                    break;
                case 6:
                    flag = true;
                    break;
                default:
                    System.out.println("1~6 사이 숫자를 입력 해 주세요");
                    break;
            }
        }

        System.out.println("프로그램 종료");
    }


}
