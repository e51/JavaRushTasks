package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a, b, c, d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());
        b = Integer.valueOf(reader.readLine());
        c = Integer.valueOf(reader.readLine());
        d = Integer.valueOf(reader.readLine());

        if (max(a, b) > max(c, d))
            System.out.println(max(a, b));
        else
            System.out.println(max(c, d));
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }
}
