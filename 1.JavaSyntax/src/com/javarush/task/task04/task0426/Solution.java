package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        String result = "положительное";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());

        if (a < 0)
            result = "отрицательное";

        if (a % 2 == 0)
            result = result + " четное число";
        else
            result = result + " нечетное число";

        if (a == 0)
            result = "ноль";

        System.out.println(result);

    }
}
