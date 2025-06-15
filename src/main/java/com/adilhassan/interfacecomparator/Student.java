package com.adilhassan.interfacecomparator;

public class Student implements Comparable<Student> {
    private String name;
    private int marks;
    private Address address;

    public Student(String name, int marks, Address address) {
        this.name = name;
        this.marks = marks;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(Student e) {
        return this.getAddress().compareTo(e.getAddress());
    }
}
