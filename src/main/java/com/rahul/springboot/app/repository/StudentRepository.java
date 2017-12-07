package com.rahul.springboot.app.repository;

import com.rahul.springboot.app.valueobject.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
