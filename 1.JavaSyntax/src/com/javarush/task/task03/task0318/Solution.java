package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int age;
        String name;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        age = Integer.parseInt(reader.readLine());
        name = reader.readLine();

        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
