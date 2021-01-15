package com.matthewwerth.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController                       //// Allows this class to serve REST endpoints.
@RequestMapping("api/v1/student")     //// Allows us to GET this data from the URI specified.
public class StudentController {

    private final StudentService studentService;

    @Autowired                        //// This is where we tell Spring to create studentService for us automatically
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping                       //// Because of @GetMapping - This function is called when we visit our @RequestMapping(uri).
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
}


// The goal is to go from CLIENT(IPHONE) -> API(GET, POST, PUT, DELETE) -> SERVICE -> DATA ACCESS -> DATABASE and then back.