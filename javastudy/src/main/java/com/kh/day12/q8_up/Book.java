package com.kh.day12.q8_up;

public class Book {
    private String bookName; // 도서명
    private String bookAuthor; // 저자
    private int bookPrice; // 가격

    public Book(String bookName, String bookAuthor, int bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "도서명 = '" + bookName + '\'' +
                ", 저자 = '" + bookAuthor + '\'' +
                ", 가격 = " + bookPrice +
                '}';
    }
}
