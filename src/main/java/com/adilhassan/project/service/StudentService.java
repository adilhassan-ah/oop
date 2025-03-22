package com.adilhassan.project.service;

import com.adilhassan.project.domain.Student;
import com.adilhassan.project.repository.Database;

import java.util.List;

/*
    CRUD application
    C - Create (insertStudent, insertStudents)
    R - Read (countStudents, findByRollNumber, exists, printAllStudents, findStudentWithHighestMarks, findStudentWithLowestMarks, findAverageOfAllStudents)
    U - Update (updateStudent)
    D - Delete (deleteStudent)
 */
public class StudentService {
    private Database database;

    public StudentService(Database database) {
        this.database = database;
    }

    public boolean insertStudent(Student student) {
        return database.insert(student);
    }

    public boolean insertStudents(List<Student> students) {
        return database.insertAll(students);
    }

    public boolean deleteStudent(Student student) {
        return database.delete(student);
    }

    public boolean updateStudent(Student student) {
        return database.update(student);
    }

    public int countStudents() {
        return database.count();
    }

    public Student findByRollNumber(int rollNumber) {
        List<Student> students = database.findAll();

        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }

        throw new RuntimeException("Student with roll number " + rollNumber + " doesn't exist");
    }

    public boolean exists(Student student) {
        return database.exists(student);
    }

    public void printAllStudents() {
        List<Student> students = database.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentWithHighestMarks() {
        List<Student> students = database.findAll();

        Student studentWithHighestMarks = students.get(0);

        for (Student student : students) {
            if (student.getMarks() > studentWithHighestMarks.getMarks()) {
                studentWithHighestMarks = student;
            }
        }

        return studentWithHighestMarks;
    }

    public Student findStudentWithLowestMarks() {
        List<Student> students = database.findAll();
        Student studentWithLowestMarks = students.get(0);

        for (Student student : students) {
            if (student.getMarks() < studentWithLowestMarks.getMarks()) {
                studentWithLowestMarks = student;
            }
        }

        return studentWithLowestMarks;
    }

    public double findAverageOfAllStudents() {
        List<Student> students = database.findAll();
        int totalMarks = 0;

        for (Student student : students) {
            totalMarks += student.getMarks();
        }

        return (double) totalMarks /students.size();
    }
}
