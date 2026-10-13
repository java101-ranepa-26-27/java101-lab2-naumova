package ru.ranepa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        Student student = new Student(name);
        System.out.println("Введите оценок. Для завершения введите 0:");
        int grade = scanner.nextInt();
        while (grade != 0) {
            student.addGrade(grade);
            grade = scanner.nextInt();
        }
        student.printReport();
    }
}