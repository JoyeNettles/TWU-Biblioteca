package com.twu.biblioteca;


import java.io.PrintStream;

public class Biblioteca {

    Biblioteca(PrintStream ps) {
        this.printStream = ps;
    }

    private PrintStream printStream;

    public void welcome() {
        printStream.println("Welcome to the biblioteca!");
    }
}
