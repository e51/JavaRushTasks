package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int max;
        int min;

        if (a > b) {
            max = a; min = b;
        } else {
            max = b; min = a;
        }

        if (c > max) {
            System.out.println(c + " " + max + " " + min);
        } else {
            System.out.print(max + " ");
            if (c > min) {
                System.out.println(c + " " + min);
            } else {
                System.out.println(min + " " + c);
            }
        }


    }
}
