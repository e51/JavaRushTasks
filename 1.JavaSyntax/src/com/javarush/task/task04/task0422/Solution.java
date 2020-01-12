package com.javarush.task.task04.task0422;

/* 
18+
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

        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
