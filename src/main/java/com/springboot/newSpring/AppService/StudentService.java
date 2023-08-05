package com.springboot.newSpring.AppService;

import com.springboot.newSpring.ModelStudent.Student;
import org.springframework.stereotype.Component;

import java.util.List;
public interface StudentService {
    Student SaveStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentByID(long id);
    Student UpdateStudent(Student student,long id);
    void deleteStudent(long id);
}
