package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));
    }

    public static void main(String[] args) {

    }

    public static class Thread1 implements Runnable {

        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class Thread2 implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class Thread3 implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        @Override
        public void run() {
//            while (!Thread.currentThread().isInterrupted());
            while (!this.isInterrupted()) ;
        }

        @Override
        public void showWarning() {
//            Thread.currentThread().interrupt();
            this.interrupt();
        }
    }

    public static class Thread5 implements Runnable {

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int sum = 0;
            try {
                while (true) {
                    synchronized (reader) {
                        if (reader.ready()) {
                            String value = reader.readLine();

                            if ("N".equals(value)) {
                                System.out.println(sum);
                                break;
                            } else {
                                sum = sum + Integer.valueOf(value);
                            }
                        }
                    }
                }
            } catch (IOException e) {

            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}