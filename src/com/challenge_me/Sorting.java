package com.challenge_me;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Sorting {
    public static void sortcgpa(List<Student> listt){
    listt.sort(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).reversed().thenComparing(Student::getId).reversed());
    }
    public static void main(String[] args) {
//33 Rumpa 3.68
//85 Ashis 3.85
//56 Samiha 3.75
//19 Samara 3.75
//22 Fahim 3.76
        /*simple program to sort by cgpa and if its equal by name and if its
         * also equal by id*/
        Student Rumpa = new Student(33,"Rumpa", 3.68);
        Student Ashis = new Student(85,"Ashis",3.85);
        Student Samiha = new Student(56,"Samiha",3.75);
        Student Samara = new Student(19,"Samara",3.75);
        Student Fahim = new Student(22,"Fahim",3.76);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Rumpa);
        studentList.add(Ashis);
        studentList.add(Samiha);
        studentList.add(Samara);
        studentList.add(Fahim);
        sortcgpa(studentList);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
