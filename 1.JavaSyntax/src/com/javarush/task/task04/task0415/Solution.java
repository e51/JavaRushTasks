package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());
        b = Integer.valueOf(reader.readLine());
        c = Integer.valueOf(reader.readLine());

        if (compare(a, b + c) & compare(b, a + c) & compare(c, a + b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }

    public static boolean compare(int a, int b) {
        return a < b;
    }
}