package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        // ugly solving, sorry

        if (string == null)
            throw new TooShortStringException();

        int pos1 = string.indexOf("\t");
        int pos2 = string.substring(pos1 + 1).indexOf("\t");

        if (pos2 == -1)
            throw new TooShortStringException();

//        System.out.println(pos1);
//        System.out.println(pos2);
//        System.out.println(string.substring(pos1 + 1, pos2 + pos1 + 1).length());

        return string.substring(pos1 + 1, pos2 + pos1 + 1);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("111\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
