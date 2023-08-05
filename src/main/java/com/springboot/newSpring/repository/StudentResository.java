package com.springboot.newSpring.repository;

import com.springboot.newSpring.ModelStudent.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentResository extends JpaRepository<Student,Long> {
}
