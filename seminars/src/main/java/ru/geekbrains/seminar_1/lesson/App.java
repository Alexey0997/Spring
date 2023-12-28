package ru.geekbrains.seminar_1.lesson;

import com.google.common.base.Joiner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        String[] words = {"Hello", "world!"};
        String message = Joiner.on(", ").join(words);
        System.out.println(message);
    }
}
