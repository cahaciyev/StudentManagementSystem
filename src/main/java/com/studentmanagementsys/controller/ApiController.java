package com.studentmanagementsys.controller;

import com.studentmanagementsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    final
    StudentService studentService;

    public ApiController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get-all")
    public void getAllStudents(@RequestParam int id) {
        studentService.getStudentById(id);
    }
}
