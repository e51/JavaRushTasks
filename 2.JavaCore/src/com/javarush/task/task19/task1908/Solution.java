package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = "/dev/temp/f1.txt";
//        String fileName2 = "/dev/temp/f2.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));

        while (br.ready()) {
            String[] data = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String item : data) {
//                System.out.println(item);
                if (item.matches("\\d+")) {
                    sb.append(item).append(" ");
                }
            }
            bw.write(sb.toString());
        }

        br.close();
        bw.close();
    }
}
