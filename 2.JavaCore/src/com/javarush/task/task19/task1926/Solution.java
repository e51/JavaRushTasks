package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

//        BufferedReader br = new BufferedReader(new FileReader(fileName));
        FileReader fileReader = new FileReader(fileName);

        StringBuilder sb = new StringBuilder();
        while (fileReader.ready()) {
            sb.append((char) fileReader.read());
        }

        for (String string : sb.toString().split("\n")) {
            System.out.println(new StringBuilder(string).reverse());
        }

//        while (br.ready()) {
//            System.out.println(new StringBuilder(reader.readLine()).reverse());
//        }

//        br.close();
        fileReader.close();

    }
}
