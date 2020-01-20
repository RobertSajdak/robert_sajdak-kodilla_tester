package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;

public class BookManager {
    public Book createBook (String title, String author){
        Book book = new Book (title, author);
        myCollection.add(book);
        return book;
    }

    private HashSet<Book> myCollection = new HashSet<>();
    public int size (){
        return myCollection.size();
    }






}
