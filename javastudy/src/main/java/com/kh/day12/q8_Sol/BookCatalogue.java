package com.kh.day12.q8_Sol;

import java.util.Arrays;
import java.util.Scanner;

public class BookCatalogue {
    private Book[] catalogue; // Book 객체들의 배열
    private int capacity; // 도서목록의 최대 크기
    private int bookCount; // 도서목록에 있는 책들의 총 수
    private int idx;
    Scanner scanner = new Scanner(System.in);

    //크기가 10인 비어있는 도서목록을 만든다.
    public BookCatalogue() {
        capacity = 10;
        catalogue = new Book[capacity];
        bookCount = 0;
    }

    // 도서 목록에 한 Book 객체를 추가한다.
    public void addTocatalogue(Book book, int idx) {
        catalogue[idx] = book;
//        System.out.println("책 꽂이에 책을 넣었습니다.");
        bookCount++;
    }
    public Book[] getCatalogue() {
        return catalogue;
    }

    // 책 가격 수정
    public void modiTocatalogue(String modiBook, Scanner scanner) {
        for (int i = 0; i < catalogue.length; i++) {
            if (catalogue[i] != null && catalogue[i].getBookName().equals(modiBook)) {
                System.out.print(catalogue[i].getBookName() + "의 수정 가격 입력 : ");
                int modiPrice = scanner.nextInt();
                scanner.nextLine();
                catalogue[i].setBookPrice(modiPrice);
            } else {
                System.out.println("책 이름이 없습니다.");
                return;
            }
        }
    }

    // 도서 목록에서 책 이름을 검색해서 삭제
    public void delTocatalogue(String delBook) {
        for (int i = 0; i < catalogue.length; i++) {
            if (catalogue[i] != null && catalogue[i].getBookName().equals(delBook)) {
                System.out.println(catalogue[i].getBookName() + "이 삭제 됩니다.");
                catalogue[i] = null;
            }
        }
        bookCount--;
    }


    @Override
    public String toString() {
        return "BookCatalogue{" +
                "catalogue=" + Arrays.toString(catalogue) +
                ", capacity=" + capacity +
                ", bookCount=" + bookCount +
                '}';
    }
}
