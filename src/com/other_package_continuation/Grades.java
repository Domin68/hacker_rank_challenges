package com.other_package_continuation;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        gradingStudents(grades);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrade = new ArrayList<>();
        for (int i : grades) {
            int grade = i;
            if (grade > 37) {
                if (grade % 5 > 2) {
                    while (grade % 5 != 0) {
                        grade++;
                    }
                }
            }
            newGrade.add(grade);
        }
        for (int iii : newGrade) {
            System.out.println(iii);
        }
        return newGrade;
    }

}
//73
//67
//38
//33
