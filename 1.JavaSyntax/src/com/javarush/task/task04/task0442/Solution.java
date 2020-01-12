package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 0;
        int total = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (a != -1) {
            a = Integer.valueOf(reader.readLine());
            total = total + a;
        }

        System.out.println(total);

    }
}
