package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testString.printSomething();

        System.setOut(original);

        String data = outputStream.toString().trim();
        String[] arr = outputStream.toString().split(" ");

        StringBuilder sb = new StringBuilder(data);

        int a = Integer.valueOf(arr[0]);
        String operation = arr[1];
        int b = Integer.valueOf(arr[2]);

        if ("+".equals(operation)) {
            sb.append(" ").append(a + b);
        } else if ("-".equals(operation)) {
            sb.append(" ").append(a - b);
        } else if ("*".equals(operation)) {
            sb.append(" ").append(a * b);
        }

        System.out.println(sb.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

