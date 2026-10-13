package ru.ranepa;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String n) {
        name = n;
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double average() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (double) sum / grades.size();
    }

    public String status() {
        double avg = average();
        if (avg >= 4.5) {
            return "отличник";
        }
        if (avg >= 3.5) {
            return "хорошист";
        }
        if (avg >= 2.5) {
            return "троечник";
        }
        return "двоечник";
    }

    public String report() {
        return "Имя: " + name
                + "\nОценки: " + grades
                + "\nСредний балл: " + average()
                + "\nСтатус: " + status();
    }

    public void printReport() {
        System.out.println(report());
    }
}