package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

//        args = "-c Миронов м 15/04/1990".split(" ");
//        args = "-u 1 Petrov м 01/01/1980".split(" ");
//        args = "-d 1".split(" ");
//        args = "-i 1".split(" ");

        if (args.length == 0) return;

        String action = args[0];

        if ("-i".equals(action)) getById(args[1]);
        if ("-d".equals(action)) deleteById(args[1]);
        if ("-u".equals(action)) updateById(args[1], args[2], args[3], args[4]);
        if ("-c".equals(action)) create(args[1], args[2], args[3]);

//        getById("2");

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
