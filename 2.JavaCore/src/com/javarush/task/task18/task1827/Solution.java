package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) return;

        if ("-c".equals(args[0])) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String file = "/dev/temp/crud.txt";
            String file = reader.readLine();
            reader.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            int maxID = 0;
            while (br.ready()) {
                int id = Integer.valueOf(br.readLine().substring(0, 8).trim());
                if (maxID < id) maxID = id;
            }

            br.close();

//            String id = "1";
//            String productName = "Куртка для сноубордистов, разм";
//            String price = "10173.99";
//            String quantity = "1234";
            String productName = args[1].length() > 30 ? args[1].substring(0, 30) : args[1];
            String price = args[2].length() > 8 ? args[2].substring(0, 8) : args[2];
            String quantity = args[3].length() > 4 ? args[3].substring(0, 4) : args[3];
            String id = "" + (maxID + 1);
            id = id.length() > 8 ? id.substring(0, 8) : id;

            String result = String.format("%-8s%-30s%-8s%-4s%n", id, productName, price, quantity);

//            System.out.println(result);

//            OutputStream outputStream = new FileOutputStream(file, true);
//            outputStream.write(result.getBytes());
//            outputStream.close();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            bufferedWriter.newLine();
            bufferedWriter.write(result);
            bufferedWriter.close();
        }
    }
}
