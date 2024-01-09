package com.kh.day12.q8_up;
// 패키지 up은 Sol에서 넘어옴
import java.util.Arrays;
import java.util.Scanner;

public class BookCatalogue {
    private Book[] catalogue; // Book 객체들의 배열
    private int capacity; // 도서목록의 최대 크기
    private static int bookCount; // 도서목록에 있는 책들의 총 수
    private int idx;
    Scanner scanner = new Scanner(System.in);

    //크기가 10인 비어있는 도서목록을 만든다.
    public BookCatalogue() {
        capacity = 10;
        catalogue = new Book[capacity];
        bookCount = 0;
    }

    // null인 인덱스 찾기
    private int findNullIdx() {
        int idx = -1;
        for (int i = 0; i < catalogue.length; i++) {
            if (catalogue[i] == null) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    // 도서명으로 인덱스 찾기
    private int searchBookIdx(String bookName) {
        int idx = -1;
        for (int i = 0; i < catalogue.length; i++) {
            if (catalogue[i] != null && catalogue[i].getBookName().equals(bookName)) {
                idx = i;
                break;
            }
        }
        return idx;
    }


    // 도서 목록에 한 Book 객체를 추가한다.
    // 도서추가
    public void addTocatalogue(String bookName, String autor, int price) {
//        for (int i = 0; i < catalogue.length; i++) {
//            if (catalogue[i] == null) {
//                catalogue[i] = book;
//                break;
//            }
//        }
//        bookCount++;
        // 비어있는 인덱스 찾기
        int nullIdx = findNullIdx();
        if (nullIdx == -1) {
            System.out.println("10권 모두 찼습니다.");
        } else {
            catalogue[nullIdx] = new Book(bookName, autor, price);
            System.out.println(catalogue[nullIdx].getBookName() + " 도서가 추가되었습니다.");
        }
        bookCount++;
    }

    public Book[] getCatalogue() {
        return catalogue;
    }

    // 단권 조회
    public void findBook(String bookName) {
        int findIdx = searchBookIdx(bookName);
        if (findIdx == -1) {
            System.out.println("찾고자 하는 도서가 없습니다.");
            return;
        }
        System.out.println("도서명 : " + catalogue[findIdx].getBookName());
        System.out.println("저 자 : " + catalogue[findIdx].getBookAuthor());
        System.out.println("가 격 : " + catalogue[findIdx].getBookPrice());
        System.out.println("----------------------------");
    }

    // 전체 조회
    public void listBook() {
        for (Book ele : catalogue) {
            if (ele != null) {
                System.out.println("도서명 : " + ele.getBookName());
                System.out.println("저 자 : " + ele.getBookAuthor());
                System.out.println("가 격 : " + ele.getBookPrice());
                System.out.println("----------------------------");
            } else {
                System.out.println("도서가 없습니다");
                return;
            }
        }
    }

    // 책 가격 수정
//    public void modiTocatalogue(String modiBook, Scanner scanner) {
//        for (int i = 0; i < catalogue.length; i++) {
//            if (catalogue[i] != null && catalogue[i].getBookName().equals(modiBook)) {
//                System.out.print(catalogue[i].getBookName() + "의 수정 가격 입력 : ");
//                int modiPrice = scanner.nextInt();
//                scanner.nextLine();
//                catalogue[i].setBookPrice(modiPrice);
//            } else {
//                System.out.println("책 이름이 없습니다.");
//                return;
//            }
//        }
//    }
    public void changeBookPrice(String bookName, int price) {
        int priceIdx = searchBookIdx(bookName);
        if (priceIdx == -1) {
            System.out.println("찾고자 하는 도서가 없습니다.");
            return;
        }
        catalogue[priceIdx].setBookPrice(price);
        System.out.println(catalogue[priceIdx].getBookName() + " 도서의 가격이 " + catalogue[priceIdx].getBookPrice() + "로 수정되었습니다.");
    }

    // 도서 목록에서 책 이름을 검색해서 삭제
    public void delTocatalogue(String bookName) {
        int delIdx = searchBookIdx(bookName);
        if (delIdx == -1) {
            System.out.println("찾고자 하는 도서가 없습니다.");
            return;
        }
        catalogue[delIdx] = null;
        System.out.println(bookName + "도서가 제거되었습니다");
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
