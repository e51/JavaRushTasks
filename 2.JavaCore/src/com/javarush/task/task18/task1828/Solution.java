package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) return;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file = "/dev/temp/crud.txt";
        String file = reader.readLine();
        reader.close();

        List<String> list = new ArrayList<>();

        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        while (reader.ready()) {
            list.add(reader.readLine());
        }

        reader.close();

//        String action = "-u";
        String action = args[0];
//        String id = "19847984";
        String id = args[1];

        int index = -1;
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            String str = list.get(i).substring(0, 8).trim();
//            System.out.println(str);
            if (list.get(i).substring(0, 8).trim().equals(id)) {
                index = i;
                break;
            }
        }

        if ("-d".equals(action) && index != -1) {
            // delete
            list.remove(index);

        } else if ("-u".equals(action) && index != -1) {
            // update
//            String productName = "xxx";
//            String price = "123.12";
//            String quantity = "44";
            String productName = args[2];
            String price = args[3];
            String quantity = args[4];

            list.set(index, String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity));
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
