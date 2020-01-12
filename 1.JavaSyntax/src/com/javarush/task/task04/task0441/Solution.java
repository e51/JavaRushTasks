package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a, b, c;
        int total;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());
        b = Integer.valueOf(reader.readLine());
        c = Integer.valueOf(reader.readLine());

        total = a + b + c;

        total = total - min(a, min(b, c));
        total = total - max(a, max(b, c));

        System.out.println(total);
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;

        return b;
    }
    public static int max(int a, int b) {
        if (a > b)
            return a;

        return b;
    }



}
