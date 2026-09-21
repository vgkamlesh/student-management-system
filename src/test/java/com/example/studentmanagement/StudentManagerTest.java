package com.example.studentmanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentManagerTest {

    @Test
    void testAddStudent() {
        StudentManager manager = new StudentManager();

        Student student = new Student(1, "Kamal", "Computer Science");

        manager.addStudent(student);

        assertEquals(1, manager.getStudents().size());
        assertEquals(student, manager.getStudents().get(0));
    }

    @Test
    void testFindStudentById() {
        StudentManager manager = new StudentManager();

        Student student = new Student(1, "Kamal", "Computer Science");

        manager.addStudent(student);

        Student result = manager.findStudentById(1);

        assertNotNull(result);
        assertEquals("Kamal", result.getName());
        assertEquals("Computer Science", result.getDepartment());
    }

    @Test
    void testStudentNotFound() {
        StudentManager manager = new StudentManager();

        Student result = manager.findStudentById(99);

        assertNull(result);
    }
}