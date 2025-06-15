package com.adilhassan.interfacecomparable.v2;

public class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student e) {
        if (this.getMarks() < e.getMarks()) {
            return -1;
        }

        if (this.getMarks() > e.getMarks()) {
            return 1;
        }

        return 0;
    }
}
