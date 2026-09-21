package com.example.studentmanagement;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(
                new Student(1, "Kamal", "Computer Science")
        );

        manager.addStudent(
                new Student(2, "Rahul", "Information Technology")
        );

        System.out.println("Student Management System");
        System.out.println("-------------------------");

        for (Student student : manager.getStudents()) {
            System.out.println(student);
        }

        Student student = manager.findStudentById(1);

        if (student != null) {
            System.out.println("\nStudent found:");
            System.out.println(student);
        }
    }
}