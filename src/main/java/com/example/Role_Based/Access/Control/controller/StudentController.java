package com.example.Role_Based.Access.Control.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Role_Based.Access.Control.model.Student;
import com.example.Role_Based.Access.Control.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String viewStudents(Model model) {
        model.addAttribute("students", studentService.getAll());
        model.addAttribute("newStudent", new Student());
        return "user";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute("newStudent") Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "redirect:/admin";
    }
}

