package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[3];
        arrayLists[0] = new ArrayList<>();
        arrayLists[1] = new ArrayList<>();
        arrayLists[2] = new ArrayList<>();

        arrayLists[0].add("list 1, item 1");
        arrayLists[0].add("list 1, item 2");

        arrayLists[1].add("list 2, item 1");
        arrayLists[1].add("list 2, item 2");

        arrayLists[2].add("list 3, item 1");
        arrayLists[2].add("list 3, item 2");

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}