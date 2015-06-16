package com.twu.biblioteca;

import org.junit.Test;
//import static org.junit.Assert.assertEquals;
import java.io.PrintStream;
import static org.mockito.Mockito.*;

public class BibliotecaTest {

    @Test
    public void shouldPrintSomething() {
        Biblioteca biblioteca = new Biblioteca();
        PrintStream printStream = mock(PrintStream.class);

        biblioteca.welcome(printStream);

        verify(printStream).println(contains(""));
    }

    @Test
    public void shouldPrintAWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        PrintStream printStream = mock(PrintStream.class);

        biblioteca.welcome(printStream);

        verify(printStream).println("Welcome to the biblioteca!");
    }

    @Test
    public void shouldListAllBooks(){

    }
}
