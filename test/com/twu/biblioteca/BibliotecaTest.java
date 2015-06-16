package com.twu.biblioteca;

import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import java.io.PrintStream;
import static org.mockito.Mockito.*;

public class BibliotecaTest {

    @Test
    public void shouldPrintSomething() {
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(printStream);

        biblioteca.welcome();

        verify(printStream).println(contains(""));
    }

    @Test
    public void shouldPrintAWelcomeMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(printStream);

        biblioteca.welcome();

        verify(printStream).println("Welcome to the biblioteca!");
    }

    @Test
    public void shouldListAllBooks(){

    }
}
