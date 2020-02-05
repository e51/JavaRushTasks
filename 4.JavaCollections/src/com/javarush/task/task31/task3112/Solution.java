package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));
//        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("/dev/temp/"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);

        String filename = Paths.get(url.getFile()).getFileName().toString();

        Path tempFile = Files.createTempFile("temp-",".tmp");
        Files.copy(url.openStream(), tempFile, REPLACE_EXISTING);

        Path file = Paths.get(downloadDirectory + "/" + filename);
        Files.move(tempFile, file, REPLACE_EXISTING);


        return file;
    }
}
