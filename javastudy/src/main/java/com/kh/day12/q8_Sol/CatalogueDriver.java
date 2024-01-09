package com.kh.day12.q8_Sol;
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
            Book[] catalogue = bcat.getCatalogue(); // 아래에 공통적으로 들어가서 위에서 선언
            System.out.println("도서 / 추가(1) / 삭제(2) / 가격수정(3) / 1권조회(4) / 전체조회(5) / 종료(6)");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    boolean addBook = false;
                    while (!addBook) {
                        System.out.print("도서명 : ");
                        bookName = scanner.nextLine();
                        System.out.print("저자 : ");
                        bookAutor = scanner.nextLine();
                        System.out.print("가격 : ");
                        bookPrice = scanner.nextInt();
                        scanner.nextLine();

                        // 값을 입력받아서 책을 생성
                        Book book = new Book(bookName, bookAutor, bookPrice);

                        // 비어있는 요소 찾기(null)
                        int idx = -1;
//                        Book[] catalogue = bcat.getCatalogue(); // ★공통적으로 오니 위로 빼는게 좋음
                        for (int i = 0; i < catalogue.length; i++) {
                            if (catalogue[i] == null) {
                                idx = i;
                                break;
                            }
                        }
                        if (idx == -1) {
                            System.out.println("더 이상 추가할 수 없습니다.");
                        } else {
                            // 책을 책꽂이에 꽂기
                            bcat.addTocatalogue(book, idx);
                            System.out.println("도서가 추가되었습니다.");
                        }


                        System.out.print("도서를 계속 추가하겠습니까?(y/n) : ");
                        String go = scanner.nextLine();
                        if (!go.equalsIgnoreCase("Y")) {
                            addBook = true;
                        }
                    }
                    break;
                case 2:
                    System.out.print("삭제 할 책 이름을 입력 : ");
                    String delBook = scanner.nextLine();
                    bcat.delTocatalogue(delBook);
                    break;
                case 3:
                    System.out.print("수정 할 책 이름을 입력 : ");
                    String modiBook = scanner.nextLine();
                    bcat.modiTocatalogue(modiBook, scanner);
                    break;
                case 4:
//                    Book[] catalogue = bcat.getCatalogue(); // ★중복되서 switch 위에서 선언
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    // 입력받은 도서명과 같은 배열을 index값에 저장시키기
                    int idx2 = -1;
                    for (int i = 0; i < catalogue.length; i++) {
                        if (catalogue[i].getBookName().equals(bookName)) {
                            idx2 = i;
                            break;
                        }
                    }
                    if (idx2 == -1) {
                        System.out.println("조회하고자 하는 도서가 없습니다.");
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("도서명 : " + catalogue[idx2].getBookName());
                        System.out.println("저자 : " + catalogue[idx2].getBookAuthor());
                        System.out.println("가격 : " + catalogue[idx2].getBookPrice());
                    }
                    break;
                case 5:
//                    Book[] catalogue = bcat.getCatalogue(); // ★중복되서 switch 위에서 선언
                    for (Book ele : catalogue) {
                        if (ele != null) {
                            System.out.println("-------------------------------");
                            System.out.println("도서명 : " + ele.getBookName());
                            System.out.println("저자 : " + ele.getBookAuthor());
                            System.out.println("가격 : " + ele.getBookPrice());
                        }
                    }
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
        // 도서목록 출력
        System.out.println(bcat);
//        for(Book book : bcat.getCatalogue()) {
//            System.out.println(book);
//        }

    }


}
