package com.rahul.springboot.app.service;

import com.rahul.springboot.app.valueobject.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student(1, "Rahul", "Bhatia", 27, "M"),
            new Student(2, "Pratik", "Pande", 26, "M"),
            new Student(3, "Uzma", "Kadri", 25, "F")));

    public List<Student> getStudentsList() {
        return studentList;
    }

    public Student getStudent(int rollNumber) {
        return studentList.stream().filter(student -> student.getRollNumber() == rollNumber).findFirst().get();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void updateStudent(int rollNumber, Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getRollNumber() == rollNumber) {
                studentList.set(i, student);
                break;
            }
        }
    }

    public void deleteStudent(int rollNumber) {
        studentList.remove(studentList.stream().filter(student -> student.getRollNumber() == rollNumber).findFirst().get());
    }
}
