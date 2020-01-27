package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inputStream = null;
        while (true) {
            String name = reader.readLine();
            try {
                inputStream = new FileInputStream(name);
            } catch (FileNotFoundException e) {
                System.out.println(name);
                reader.close();
                return;
            } finally {
                if (inputStream != null)
                    inputStream.close();
            }
        }

    }
}
