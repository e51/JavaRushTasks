package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (a == b | a == c) System.out.print(a + " ");
        if (b == a | b == c) System.out.print(b + " ");
        if (c == a | c == b) System.out.print(c);
    }
}