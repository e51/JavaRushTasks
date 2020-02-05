package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = "/dev/temp/file1.txt";
//        String file2 = "/dev/temp/file2.txt";
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        while (br.ready()) {
            String data = br.readLine();
//            System.out.println(data.replaceAll("\\.", "\\!"));
            bw.write(data.replaceAll("\\.", "\\!"));
        }

        br.close();
        bw.close();
    }
}
