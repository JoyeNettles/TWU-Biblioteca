package com.twu.biblioteca;

import org.junit.Before;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class BibliotecaAppTest {

    PrintStream printStream;
    List<String> books;
    Biblioteca biblioteca;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        books = new ArrayList<String>();
        biblioteca = new Biblioteca(printStream, books);

    }
}
