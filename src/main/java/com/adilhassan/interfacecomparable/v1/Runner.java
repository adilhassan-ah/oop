package com.adilhassan.interfacecomparable.v1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Student e1 = new Student("Imran", 30);
        Student e2 = new Student("Adil", 20);
        Student e3 = new Student("Ali", 40);

        Student[] employees = {e1, e2, e3};

        System.out.println("Before sort");
        for (Student employee : employees) {
            System.out.println(employee.getName() + " - Marks: " + employee.getMarks());
        }

        System.out.println();
        Arrays.sort(employees);

        System.out.println("After sort by name");
        for (Student employee : employees) {
            System.out.println(employee.getName() + " - Marks: " + employee.getMarks());
        }
    }
}
