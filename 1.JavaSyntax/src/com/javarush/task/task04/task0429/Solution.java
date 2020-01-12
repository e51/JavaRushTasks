package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a, b, c;
        int negative = 0;
        int positive = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());
        b = Integer.valueOf(reader.readLine());
        c = Integer.valueOf(reader.readLine());

        if (a > 0) positive++;
        if (b > 0) positive++;
        if (c > 0) positive++;
        if (a < 0) negative++;
        if (b < 0) negative++;
        if (c < 0) negative++;

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
