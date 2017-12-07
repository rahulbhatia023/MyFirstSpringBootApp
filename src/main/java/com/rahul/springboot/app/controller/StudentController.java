package com.rahul.springboot.app.controller;

import com.rahul.springboot.app.dao.StudentDAO;
import com.rahul.springboot.app.service.StudentDataService;
import com.rahul.springboot.app.service.StudentService;
import com.rahul.springboot.app.valueobject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentDAO studentDAO;

    @RequestMapping("/students")
    public List<Student> getStudentsList() {
        return studentDAO.getStudentsList();
    }

    @RequestMapping("/students/{rollNumber}")
    public Student getStudent(@PathVariable int rollNumber) {
        return studentDAO.getStudent(rollNumber);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentDAO.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{rollNumber}")
    public void updateStudent(@PathVariable int rollNumber, @RequestBody Student student) {
        studentDAO.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{rollNumber}")
    public void deleteStudent(@PathVariable int rollNumber) {
        studentDAO.deleteStudent(rollNumber);
    }
}
