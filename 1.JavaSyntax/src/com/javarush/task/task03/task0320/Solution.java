package com.javarush.task.task03.task0320;

/* 
Скромность украшает программиста
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        name = reader.readLine();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}
