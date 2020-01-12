package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int age;
        int value;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        name = reader.readLine();
        value = Integer.valueOf(reader.readLine());
        age = Integer.valueOf(reader.readLine());

        System.out.println(name + " получает " + value + " через " + age + " лет.");
    }
}
