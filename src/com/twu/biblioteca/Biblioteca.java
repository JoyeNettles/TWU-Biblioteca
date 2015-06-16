package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.List;

public class Biblioteca {

    private final List<String> books;

    Biblioteca(PrintStream printStream, List<String> books) {
        this.printStream = printStream;
        this.books = books;
    }

    private PrintStream printStream;

    public void welcome() {
        printStream.println("Welcome to the biblioteca!");
    }
}
