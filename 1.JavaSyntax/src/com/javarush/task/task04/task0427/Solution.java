package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        String result = "четное";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.valueOf(reader.readLine());

        if (a > 0 && a <1000) {

            if (a % 2 != 0)
                result = "нечетное";

            if (a < 10) {
                result = result + " однозначное число";
            } else if (a < 100) {
                result = result + " двузначное число";
            } else {
                result = result + " трехзначное число";
            }

            System.out.println(result);
        }


    }
}
