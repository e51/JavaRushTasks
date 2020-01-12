package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x, y;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.valueOf(reader.readLine());
        y = Integer.valueOf(reader.readLine());

        if (x > 0) {
            if (y > 0)
                System.out.println(1);
            else
                System.out.println(4);
        } else {
            if (y > 0)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}
