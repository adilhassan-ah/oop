package com.adilhassan.interfacecomparable.v4;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Student e1 = new Student("Imran", 30, new Address("Pakistan", "Attock"));
        Student e2 = new Student("Adil", 20, new Address("Pakistan", "Islamabad"));
        Student e3 = new Student("Ali", 40, new Address("Bangladesh", "Dhaka"));
        Student e4 = new Student("Faisal", 50, new Address("Bangladesh", "Sherpur"));

        Student[] employees = {e1, e2, e3, e4};

        System.out.println("Before sort");
        for (Student employee : employees) {
            System.out.println(employee.getName() + " - Marks: " + employee.getMarks());
        }

        System.out.println();
        Arrays.sort(employees);

        System.out.println("After sort by address");
        for (Student employee : employees) {
            System.out.println(employee.getName() + " - Address: " + employee.getAddress());
        }
    }
}
