package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
//        String initialFolder = "/dev/temp/folder/";
//        String resultFile = "/dev/temp/result.txt";
        String initialFolder = args[0];
        String resultFile = args[1];

        File path = new File(initialFolder); //Путь к директории

        List<File> list = new ArrayList();

        scanFolder(list, path);

        list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                File obj1 = (File) o1;
                File obj2 = (File) o2;

                return obj1.getName().compareTo(obj2.getName());
            }
        });

        File resultFileAbsolutePath = new File(resultFile); //Файл с содержимым всех файлом <50
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        if (FileUtils.isExist(allFilesContent)) {
            FileUtils.deleteFile(allFilesContent);
        }
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        try (FileOutputStream fos = new FileOutputStream(allFilesContent)) {
//        try (PrintStream printStream = new PrintStream(allFilesContent)) { // валидатор не берёт PrintStream

            for (File file : list) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                while (br.ready()) {
//                    printStream.println(br.readLine());
                    fos.write((br.readLine() + "\n").getBytes());
                }
                br.close();
//                printStream.println();
            }
        }
    }

    public static void scanFolder(List list, File file){
        if (file.isDirectory()) {
            for (File ff : file.listFiles()) {
                scanFolder(list, ff);
            }
        } else if (file.isFile() && file.getName().endsWith(".txt")) {
            if (file.length() <= 50) {
                list.add(file);
            }
        }
    }

}
