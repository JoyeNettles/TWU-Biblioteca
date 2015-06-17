package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class BibliotecaAppTest {

    PrintStream printStream;
    List<String> books;
    Biblioteca biblioteca;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        books = new ArrayList<String>();
        biblioteca = new Biblioteca(printStream, books);

    }

}
