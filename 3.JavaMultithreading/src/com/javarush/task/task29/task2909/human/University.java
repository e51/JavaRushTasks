package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students) {
            if (student.getAverageGrade() == averageGrade)
                return student;
        }

        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double maxAverageGrade = 0;
        Student studentWithMaxAvGrade = null;
        for (Student student : students) {
            if (student.getAverageGrade() > maxAverageGrade) {
                studentWithMaxAvGrade = student;
                maxAverageGrade = student.getAverageGrade();
            }
        }

        return studentWithMaxAvGrade;
    }

    public Student getStudentWithMinAverageGrade() {
        double minAverageGrade = 1000;
        Student studentWithMinAvGrade = null;
        for (Student student : students) {
            if (student.getAverageGrade() < minAverageGrade) {
                studentWithMinAvGrade = student;
                minAverageGrade = student.getAverageGrade();
            }
        }

        return studentWithMinAvGrade;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}