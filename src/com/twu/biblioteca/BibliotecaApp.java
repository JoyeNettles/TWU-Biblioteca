package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        List<String> books = new ArrayList<String>();
        books.add("Everything is Illuminated");
        books.add("Native Son");

        BibliotecaApp application = new BibliotecaApp();
        Biblioteca biblioteca = new Biblioteca(System.out, books);

        application.run(biblioteca);
    }

    public void run(Biblioteca biblioteca) {

        biblioteca.welcome();
        biblioteca.listBooks();
    }
}