package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String file = "/dev/temp/file-en.txt";
        String file = args[0];
        int[] symbols = new int[128];

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        while (reader.ready()) {
            int data = reader.read();
            symbols[data] = symbols[data] + 1;
        }

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] != 0)
                System.out.println((char) i + " " + symbols[i]);
        }

        reader.close();

    }
}
