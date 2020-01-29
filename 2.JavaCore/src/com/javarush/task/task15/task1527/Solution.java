package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String text = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
//        String text = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        String text = reader.readLine();

        text = text.substring(text.indexOf('?') + 1);
//        System.out.println(text);
        String[] pairs = text.split("&");
//        System.out.println(Arrays.toString(pairs));

        List<String> list = new ArrayList<>();

        for (String item : pairs) {
            String[] pair = item.split("=");
            if ("obj".equals(pair[0])) {
                if (pair.length == 2)
                    list.add(pair[1]);
            }
            System.out.print(pair[0] + " ");
        }
        System.out.println();

        for (String item : list) {
            try {
                double value = Double.parseDouble(item);
                alert(value);
            } catch (Exception e) {
                alert(item);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
