package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        while (br.ready()) {
            String[] words = br.readLine().split(" ");
            for (String word : words) {
                if (word.matches(".*[0-9]+.*"))
                    bw.write(word + " ");
            }
        }

        br.close();
        bw.close();
    }
}
