package com.rahul.springboot.app.dao;

import com.rahul.springboot.app.repository.StudentRepository;
import com.rahul.springboot.app.valueobject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDAO implements IStudentDAO {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudentsList() {
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(studentList::add);
        return studentList;
    }

    @Override
    public Student getStudent(int rollNumber) {
        return studentRepository.findOne(rollNumber);
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int rollNumber) {
        studentRepository.delete(rollNumber);
    }
}
