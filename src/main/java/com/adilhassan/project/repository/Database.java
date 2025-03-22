package com.adilhassan.project.repository;

import com.adilhassan.project.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class Database {
    ArrayList<Student> students;

    public Database() {
        this.students = new ArrayList<>();
    }

    public boolean insert(Student student) {
        return students.add(student);
    }

    public boolean insertAll(List<Student> students) {
        return this.students.addAll(students);
    }

    public List<Student> findAll() {
        return students;
    }

    public int count() {
        return students.size();
    }

    public boolean exists(Student student) {
        return students.contains(student);
    }

    public boolean update(Student student) {
//      implementation 1
        boolean removed = students.removeIf(s -> s.getRollNumber() == student.getRollNumber());
        return removed ? students.add(student) : false;

//        implementation 2
//        List<Student> students = findAll();
//
//        for (Student std : students) {
//            if (std.getRollNumber() == student.getRollNumber()) {
//                std.setMarks(student.getMarks());
//                std.setName(std.getName());
//
//                return true;
//            }
//        }
//
//        return false;
    }

    public boolean delete(Student student) {
        return students.remove(student);
    }
}
