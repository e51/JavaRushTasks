package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            String str = null;
            str.equals("");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            System.out.println((new int[0])[1]);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Solution solution = (Solution) new Object();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            new FileInputStream("file_does_not_exist");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt("letters_only");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "123";
            System.out.println(s.charAt(4));

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
//            throw new RuntimeException();
            (new ArrayList<>()).get(1);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new Exception();

        } catch (Exception e) {
            exceptions.add(e);
        }



    }
}
