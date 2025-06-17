package org.day2.Book;

public class Fiction extends Book {
    protected String genre;
    //constructor
    public Fiction(String title,String author, String genre) {
        super(title, author);
        this.genre=genre;

    }
    @Override
    public void DisplayInfo() {

        System.out.printf("%nBook: %s Author: %s Genre: %s%n",title,author,genre);
        System.out.println("function DisplayInfo() Overridden");
    }


}