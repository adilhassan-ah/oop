package com.adilhassan.filehandling.v5;

import java.io.Serializable;

public class Employee implements Serializable {
    // serialization id
    private static final long serialVersionUID = 2L;

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}