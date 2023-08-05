package com.springboot.newSpring.AppService.impl;

import com.springboot.newSpring.AppService.StudentService;
import com.springboot.newSpring.Exception.ResourceNotFoundException;
import com.springboot.newSpring.ModelStudent.Student;
import com.springboot.newSpring.repository.StudentResository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentResository studentResository;
    public StudentServiceImpl(StudentResository studentResository) {
        this.studentResository = studentResository;
    }

    @Override
    public Student SaveStudent(Student student) {
        return studentResository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentResository.findAll();
    }

    @Override

    public Student getStudentByID(long id) {
        Optional<Student> student = studentResository.findById(id);
        if(student.isPresent()){
            return  student.get();
        }else{
            throw new ResourceNotFoundException("Id","helo","hello");
        }
    }

    @Override
    public Student UpdateStudent(Student student, long id) {
        //we need to check whether student with given id is exist in db or not
        Student stu = studentResository.findById(id).orElseThrow(()->new ResourceNotFoundException("Student","id","id"));
        stu.setStuName(student.getStuName());
        stu.setStuSex(student.getStuSex());
        stu.setStuScore(student.getStuScore());
        stu.setStuAddress(student.getStuAddress());
        //save existing employee to db
        studentResository.save(stu);
        return stu;
    }

    @Override
    public void deleteStudent(long id) {

        // Check whether a student exitst ina database or not
        studentResository.findById(id).orElseThrow(()->new ResourceNotFoundException(
                "student","student","id"));

        studentResository.deleteById(id);
    }


}
