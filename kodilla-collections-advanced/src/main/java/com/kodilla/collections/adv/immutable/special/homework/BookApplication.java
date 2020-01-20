package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book = new BookManager();
        Book book1 = book.createBook("Java. Podstawy", "Cay S. Horstmann");
        Book book2 = book.createBook("Programowanie w języku Java w.2", "Robert Sedgewick, Kevin Wayne");
        Book book3 = book.createBook("Java. Podstawy", "Cay S. Horstmann");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Current collection size is: " + book.size());
    }
}
