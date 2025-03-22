package com.adilhassan.project.domain;

import java.util.Objects;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "rollNumber: " + rollNumber + "\n" +
                "marks: " + marks + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber, marks);
    }
}
