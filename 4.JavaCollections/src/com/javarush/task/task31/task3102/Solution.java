package com.javarush.task.task31.task3102;

import java.io.File;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) {
        LinkedList<File> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();

        queue.add(new File(root));

        while (!queue.isEmpty()) {
            File file = queue.poll();

            if (file.isDirectory()) {
                for (File item : file.listFiles()) {
                    if (item.isDirectory())
                        queue.add(item);
                    else
                        list.add(item.getAbsolutePath());
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
        System.out.println(getFileTree("/dev/temp/"));
    }
}
