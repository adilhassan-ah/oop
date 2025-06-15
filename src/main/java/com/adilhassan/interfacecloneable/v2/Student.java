package com.adilhassan.interfacecloneable.v2;

public class Student implements Cloneable {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(this.name, this.marks, (Address) this.address.clone());
    }
}
