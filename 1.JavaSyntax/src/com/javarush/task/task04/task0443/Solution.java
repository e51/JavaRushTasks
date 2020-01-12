package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int y, m, d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        name = reader.readLine();
        y = Integer.valueOf(reader.readLine());
        m = Integer.valueOf(reader.readLine());
        d = Integer.valueOf(reader.readLine());

        System.out.println("Меня зовут " + name + ".\nЯ родился " + d + "." + m + "." + y);
    }
}
