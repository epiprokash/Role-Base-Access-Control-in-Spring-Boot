package com.example.Role_Based.Access.Control.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Role_Based.Access.Control.service.StudentService;

@Controller
public class HomeController {

    private final StudentService studentService;

    // ✅ Constructor injection (Spring will automatically provide the service bean)
    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
    model.addAttribute("students", studentService.getAll());
    return "admin";
}

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/manager")
    public String manager() {
        return "manager";
    }
}

