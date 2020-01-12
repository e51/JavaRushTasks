package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String text;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        text = reader.readLine();
        count = Integer.valueOf(reader.readLine());

        while (count > 0) {
            System.out.println(text);
            count--;
        }
    }
}
