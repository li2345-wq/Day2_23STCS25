package org.day2.Book;

public class Book {
    protected String title;
    protected String author;
    //constructor
    public Book(String title,String author) {
        this.title=title;
        this.author=author;
    }

    public void DisplayInfo() {
        System.out.println("Book: "+title+ " Author: "+author);
    }


}