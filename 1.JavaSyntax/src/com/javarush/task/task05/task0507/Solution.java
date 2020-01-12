package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 0;
        int result = 0;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (a != -1) {
            a = Integer.valueOf(reader.readLine());
            if (a != -1) {
                result = result + a;
                count++;
            }
        }

        if (count != 0)
            System.out.println(result * 1. / count);
    }
}

