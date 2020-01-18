package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file = "C:/dev/temp/text.txt";
        String file = reader.readLine();

        InputStream inputStream = new FileInputStream(file);
//        InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file));
//        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            System.out.print((char) data);
        }

//        while (inputStream.ready()) {
//            System.out.print((char) inputStream.read());
//            System.out.println(inputStream.readLine());
//        }

        inputStream.close();
        reader.close();
    }
}