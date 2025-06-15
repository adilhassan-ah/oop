package com.adilhassan.interfacecloneable.v1;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Pakistan", "Attock");
        Student s1 = new Student("Imran", 30, address);
        Student s2 = (Student) s1.clone();

        address.setCity("Islamabad");
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
