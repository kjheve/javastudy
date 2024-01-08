package com.kh.day12.q8_Sol;

import java.util.Arrays;

public class BookCatalogue {
    private Book[] catalogue; // Book 객체들의 배열
    private int capacity; // 도서목록의 최대 크기
    private int bookCount; // 도서목록에 있는 책들의 총 수

    //크기가 10인 비어있는 도서목록을 만든다.
    public BookCatalogue() {
        capacity = 10;
        catalogue = new Book[capacity];
        bookCount = 0;
    }

    // 도서 목록에 한 Book 객체를 추가한다.
    public void addTocatalogue(Book book) {
        catalogue[bookCount++] = book;
        System.out.println("책 꽂이에 책을 넣었습니다.");
    }

    @Override
    public String toString() {
        return "BookCatalogue{" +
                "catalogue=" + Arrays.toString(catalogue) +
                ", capacity=" + capacity +
                ", bookCount=" + bookCount +
                '}';
    }
//
//    public Book[] getCatalogue() {
//        return catalogue;
//    }
}
