package com.kh.day12.q8_chatGPT;

import java.util.Arrays;

public class BookCatalogue {
    private Book[] catalogue; // Book 객체들의 배열
    private int capacity;     // 도서목록의 최대 크기
    private int bookCount;     // 도서목록에 있는 책들의 총 수

    // 생성자 메소드: 크기가 10인 비어 있는 도서목록을 만든다
    public BookCatalogue() {
        capacity = 10;
        catalogue = new Book[capacity];
        bookCount = 0;
    }

    // 도서목록에 한 Book 객체를 추가한다
    public void addToCatalogue(Book book) {
        if (bookCount < capacity) {
            catalogue[bookCount] = book;
            bookCount++;
            System.out.println("도서가 목록에 추가되었습니다.");
        } else {
            System.out.println("도서목록이 가득 찼습니다. 더 이상 추가할 수 없습니다.");
        }
    }

    // 도서목록의 상태를 문자열로 반환한다
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("-- 도서목록 --\n");
        for (int i = 0; i < bookCount; i++) {
            result.append("책 제목: ").append(catalogue[i].getName()).append("\n");
            result.append("저자: ").append(catalogue[i].getAuthor()).append("\n");
            result.append("가격: ").append(catalogue[i].getPrice()).append("원\n\n");
        }
        return result.toString();
    }
}
