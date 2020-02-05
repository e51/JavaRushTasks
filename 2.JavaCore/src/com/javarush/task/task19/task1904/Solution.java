package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
//        System.out.println(new PersonScannerAdapter(new Scanner(System.in)).read());
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person result = null;
            if (fileScanner.hasNextLine()) {
                String[] data = fileScanner.nextLine().split(" ");
//                String[] data = "Иванов Иван Иванович 31 12 1950".split(" ");

                try {
                    result = new Person(data[1], data[2], data[0], new SimpleDateFormat("dd MM yyyy").parse(data[3] + " " + data[4] + " " + data[5]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            return result;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
