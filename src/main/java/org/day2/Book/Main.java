package org.day2.Book;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Book book = new Book("yxz","abc");
        book.DisplayInfo();
        Fiction book1 = new Fiction("1984","George Orwell","Dystopian");
        book1.DisplayInfo();
        nonfict book2 = new nonfict("C The Programming Language","Dennis Ritchie,Ken Thompson","Programming");
        book2.DisplayInfo();

    }
}