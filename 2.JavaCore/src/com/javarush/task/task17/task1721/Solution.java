package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader file1reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedReader file2reader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));

        while (file1reader.ready()) {
            allLines.add(file1reader.readLine());
        }

        while (file2reader.ready()) {
            forRemoveLines.add(file2reader.readLine());
        }

        file1reader.close();
        file2reader.close();

        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
