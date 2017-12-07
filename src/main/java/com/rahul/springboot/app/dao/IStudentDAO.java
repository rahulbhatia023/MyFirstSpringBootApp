package com.rahul.springboot.app.dao;

import com.rahul.springboot.app.valueobject.Student;

import java.util.List;

public interface IStudentDAO {
    List<Student> getStudentsList();

    Student getStudent(int rollNumber);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int rollNumber);
}
