package com.example.Role_Based.Access.Control.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Role_Based.Access.Control.model.Student;
import com.example.Role_Based.Access.Control.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    private final List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void addStudent(Student s) {
        students.add(s);
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}
