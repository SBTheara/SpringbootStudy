package com.springboot.newSpring.AppController;

import com.springboot.newSpring.AppService.StudentService;
import com.springboot.newSpring.ModelStudent.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Post Student
    @PostMapping("/post")
    public ResponseEntity <Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>((Student) studentService.SaveStudent(student), HttpStatus.CREATED);
    }

    //Get All Student
    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("{id}")//id in the bracket is using the same with Pathvariable
    public ResponseEntity<Student> getStudentByID(@PathVariable("id") long id){
        return new ResponseEntity<>(studentService.getStudentByID(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudentByID(@PathVariable("id") long id,@RequestBody Student student){
        return new ResponseEntity<>(studentService.UpdateStudent(student,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        // delete student from database;
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student Deleted",HttpStatus.OK);
    }
}
