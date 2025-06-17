package org.day2.Book;

public class nonfict extends Book{
    protected String genre;

    public nonfict(String title, String author,String genre) {
        super(title, author);
        this.genre=genre;
    }
    @Override
    public void DisplayInfo() {
        System.out.printf("%nBook: %s Author: %s Genre: %s%n",title,author,genre);
        System.out.println("function DisplayInfo() Overridden");

    }

}
