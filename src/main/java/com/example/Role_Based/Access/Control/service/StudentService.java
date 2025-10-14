package com.example.Role_Based.Access.Control.service;

import java.util.List;

import com.example.Role_Based.Access.Control.model.Student;

public interface StudentService {
    List<Student> getAll();
    void addStudent(Student s);
    void deleteStudent(int id);
}

