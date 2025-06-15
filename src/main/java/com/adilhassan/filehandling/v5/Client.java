package com.adilhassan.filehandling.v5;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var employee = new Employee("Adil", 1);

        // serializaing employee object
        OutputStream outputStream = new FileOutputStream("employee.emp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(employee);

        // deserializing employee object
        InputStream inputStream = new FileInputStream("employee.emp");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Employee emp = (Employee) objectInputStream.readObject();

        System.out.println(emp.getName());
        System.out.println(emp.getId());

    }
}
