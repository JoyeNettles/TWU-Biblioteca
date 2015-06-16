package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    PrintStream printStream;
    List<String> books;
    Biblioteca biblioteca;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        books = new ArrayList<String>();
        biblioteca = new Biblioteca(printStream, books);

    }

    @Test
    public void shouldPrintSomething() {
        biblioteca.welcome();

        verify(printStream).println(contains(""));
    }

    @Test
    public void shouldPrintAWelcomeMessage() {
        biblioteca.welcome();

        verify(printStream).println("Welcome to the biblioteca!");
    }

    @Test
    public void shouldListAllBooks() {



    }
}
