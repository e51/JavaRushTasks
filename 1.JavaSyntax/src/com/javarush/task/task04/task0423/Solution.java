package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int age;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        name = reader.readLine();
        age = Integer.valueOf(reader.readLine());

        if (age > 20)
            System.out.println("И 18-ти достаточно");

    }
}
