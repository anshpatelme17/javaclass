
package com.example.studentregistration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private ArrayList<Student> students = new ArrayList<>();

    @PostMapping
    public String registerStudent(@RequestBody Student student) {
        students.add(student);
        return "Student registered successfully!";
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }
}
