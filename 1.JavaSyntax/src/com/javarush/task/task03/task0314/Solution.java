package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        printRow(1);
        printRow(2);
        printRow(3);
        printRow(4);
        printRow(5);
        printRow(6);
        printRow(7);
        printRow(8);
        printRow(9);
        printRow(10);
    }

    public static void printRow(int n) {
        System.out.print(1 * n + " ");
        System.out.print(2 * n + " ");
        System.out.print(3 * n + " ");
        System.out.print(4 * n + " ");
        System.out.print(5 * n + " ");
        System.out.print(6 * n + " ");
        System.out.print(7 * n + " ");
        System.out.print(8 * n + " ");
        System.out.print(9 * n + " ");
        System.out.println(10 * n);

    }
}