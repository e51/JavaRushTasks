package com.javarush.task.task15.task1519;

import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            if ("exit".equals(str)) {
                break;
            }

            if (str.contains(".")) {
                try {
                    Double value = Double.valueOf(str);
                    print(Double.valueOf(str));

                } catch (NumberFormatException e) {
                    print(str);
                }
            } else
                try {
                    Integer value = Integer.valueOf(str);

                    if (value > 0 && value < 128)
                        print(value.shortValue());
                    else if (value <= 0 || value >= 128)
                        print(value);

                } catch (NumberFormatException e) {
                    print(str);
                }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
