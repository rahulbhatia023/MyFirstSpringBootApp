package com.rahul.springboot.app.service;

import com.rahul.springboot.app.repository.StudentRepository;
import com.rahul.springboot.app.valueobject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDataService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentsList() {
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }

    public Student getStudent(int rollNumber) {
        return studentRepository.findOne(rollNumber);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(int rollNumber, Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(int rollNumber) {
        studentRepository.delete(rollNumber);
    }
}
