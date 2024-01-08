package com.kh.day12.q8;

import java.util.Arrays;

public class BookCatalogue {
    private Book[] catalogue;
    private int capacity;

    private int bookCount;

    public BookCatalogue(int capacity) {
        this.capacity = capacity;
    }

    public Book addToCatologue(String name, String author, int price) {
        Book b = new Book();
        b.setName(name);
        b.setAuthor(author);
        b.setPrice(price);
        bookCount++;
        return new Book();
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
