package com.mycompany.app;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App()
    {
    }

    public static void main(String[] args)
    {
        System.out.println(new App().getMessage());

        Set<Short> s = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.size());
    }

    private final String getMessage()
    {
        return message;
    }

}
