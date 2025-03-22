package com.adilhassan.project;

import com.adilhassan.project.domain.Student;
import com.adilhassan.project.repository.Database;
import com.adilhassan.project.service.StudentService;

import java.util.List;

public class Client {
    private static Database database = new Database();
    private static StudentService studentService = new StudentService(database);

    // initializing students database
    static {
        Student ali = new Student("Ali", 1, 99);
        Student ahmed = new Student("Ahmed", 2, 75);
        Student waqas = new Student("Waqas", 3, 87);
        Student amir = new Student("Amir", 4, 100);

        database.insertAll(List.of(ali, ahmed, waqas, amir));
    }

    public static void main(String[] args) {
        System.out.println("studentService.insertStudent()");
        studentService.insertStudent(new Student("Kamran", 5, 80));
        studentService.printAllStudents();
        System.out.println("countStudents: " + studentService.countStudents());
        System.out.println("---");

        System.out.println("studentService.insertStudents()");
        List<Student> newStudents = List.of(new Student("Yousaf", 6, 90), new Student("Sheraaz", 7, 85));
        studentService.insertStudents(newStudents);
        studentService.printAllStudents();
        System.out.println("countStudents: " + studentService.countStudents());
        System.out.println("---");

        System.out.println("studentService.deleteStudent(name: Ahmed, rollNumber: 2, marks: 75)");
        Student studentToDelete = new Student("Ahmed", 2, 75);
        studentService.deleteStudent(studentToDelete);
        studentService.printAllStudents();
        System.out.println("countStudents: " + studentService.countStudents());
        System.out.println("---");

        System.out.println("studentService.updateStudent(name: Waqas, rollNumber: 3, marks: 97)");
        Student studentToUpdate = new Student("Waqas", 3, 97);
        studentService.updateStudent(studentToUpdate);
        studentService.printAllStudents();
        System.out.println("countStudents: " + studentService.countStudents());
        System.out.println("---");

        System.out.println("studentService.findByRollNumber(1)");
        Student studentWithRollNumber = studentService.findByRollNumber(1);
        System.out.println(studentWithRollNumber);
        System.out.println("---");

        System.out.println("studentService.exists(name: Yousaf, rollNumber: 6, marks: 90)");
        System.out.println(studentService.exists(new Student("Yousaf", 6, 90)));
        System.out.println();
        System.out.println("---");

        System.out.println("studentService.findStudentWithHighestMarks()");
        Student studentWithHighestMarks = studentService.findStudentWithHighestMarks();
        System.out.println(studentWithHighestMarks);
        System.out.println("---");

        System.out.println("studentService.findStudentWithLowestMarks()");
        Student studentWithLowestMarks = studentService.findStudentWithLowestMarks();
        System.out.println(studentWithLowestMarks);
        System.out.println("---");

        System.out.println("studentService.findAverageOfAllStudents()");
        System.out.println(studentService.findAverageOfAllStudents());
    }
}
