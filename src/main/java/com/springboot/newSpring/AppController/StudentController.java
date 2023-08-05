package com.springboot.newSpring.AppController;

import com.springboot.newSpring.ModelStudent.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/GetStudent")
    public Student GetStudent(){
        return new Student(
                1,"Theara","Male",120,"Phnom Penh"
        );
    }
    @GetMapping("/GetListStudent")
    public List<Student> GetListStudent(){
        return List.of(
                new Student(1,"Theara","Male",120,"Phnom Penh"),
                new Student(2,"Sambath","Male",120,"Phnom Penh")
        );
    }

}
