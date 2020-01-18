package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        // hate dates !!!

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);

        try {
            Date givenDate = inputDateFormat.parse(date);

            Date startYearDate = new Date(givenDate.getYear(), 0, 1);

//            System.out.println(givenDate.getYear());
//            System.out.println(givenDate);
//            System.out.println(startYearDate);

            long value = (givenDate.getTime() - startYearDate.getTime()) / 1000 / 60 / 60 / 24 + 1;

//            System.out.println(value);

            if (value % 2 == 0) {
                return false;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return true;
    }
}
