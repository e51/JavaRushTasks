package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());

        if (a == 0)
            System.out.println(a);
        if (a < 0)
            System.out.println(a + 1);
        if (a > 0)
            System.out.println(a * 2);

    }

}