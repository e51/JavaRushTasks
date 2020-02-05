package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream fakeOut = new PrintStream(outputStream);

        System.setOut(fakeOut);

        testString.printSomething();

        System.setOut(original);

        String[] strings = outputStream.toString().split("\n");

        int count = 0;
        for (String s : strings) {
            System.out.println(s);
            count++;
            if (count == 2) {
                count = 0;
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
