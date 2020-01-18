package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-M-d", Locale.ENGLISH);
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        Date date = inputDateFormat.parse(text);

        //System.out.println(date);

        System.out.println(outputDateFormat.format(date).toUpperCase());

    }
}
