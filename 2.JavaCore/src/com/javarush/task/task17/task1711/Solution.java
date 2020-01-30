package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

//        args = "-c Миронов м 15/04/1990 Смирнова ж 25/10/1996".split(" ");
//        args = "-u 0 Совков м 11/11/1911 1 Petrov м 01/01/1980".split(" ");
//        args = "-d 0 1".split(" ");
//        args = "-i 0 1".split(" ");

        if (args.length == 0) return;

        String action = args[0];

        switch (args[0]) {
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        getById(args[i]);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        deleteById(args[i]);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        updateById(args[i], args[i + 1], args[i + 2], args[i + 3]);
                    }
                }
                break;
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        create(args[i], args[i + 1], args[i + 2]);
                    }
                }
        }
    }

    private static void getById(String strId) {
        int id = Integer.valueOf(strId);

        String name = allPeople.get(id).getName();
        String sex = allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж";
        String bd = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(id).getBirthDate());

        System.out.println(name + " " + sex + " " + bd);
    }

    private static void deleteById(String strId) {
        int id = Integer.valueOf(strId);

        allPeople.get(id).setName(null);
        allPeople.get(id).setSex(null);
        allPeople.get(id).setBirthDate(null);
    }

    private static void updateById(String strId, String strName, String strSex, String strBirthDate) {
        int id = Integer.valueOf(strId);
        String name = strName;
        Sex sex = "м".equals(strSex) ? Sex.MALE : Sex.FEMALE;
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(strBirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        allPeople.get(id).setName(name);
        allPeople.get(id).setSex(sex);
        allPeople.get(id).setBirthDate(birthDate);
    }

    private static void create(String strName, String strSex, String strBirthDate) {
        String name = strName;
        Sex sex = "м".equals(strSex) ? Sex.MALE : Sex.FEMALE;
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(strBirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (sex == Sex.MALE)
            allPeople.add(Person.createMale(name, birthDate));
        else
            allPeople.add(Person.createFemale(name, birthDate));

        System.out.println(allPeople.size() - 1);
    }
}
