package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
//        String file = "/dev/temp/file.txt";
        String file = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(file));

        while (reader.ready()) {
            String[] arr = reader.readLine().split(" ");

            StringBuilder sbName = new StringBuilder();
            for (int i = 0; i < arr.length - 3; i++) {
                sbName.append(arr[i]).append(" ");
            }

            StringBuilder sbBirthDate = new StringBuilder();
            // alternative for loop:
//            sbBirthDate.append(arr[arr.length - 3]).append(" ");
//            sbBirthDate.append(arr[arr.length - 2]).append(" ");
//            sbBirthDate.append(arr[arr.length - 1]);
            for (int i = arr.length - 3; i < arr.length; i++) {
                sbBirthDate.append(arr[i]).append(" ");
            }

            PEOPLE.add(new Person(sbName.toString().trim(), new SimpleDateFormat("dd MM yyyy").parse(sbBirthDate.toString().trim())));
        }

        reader.close();
    }
}
