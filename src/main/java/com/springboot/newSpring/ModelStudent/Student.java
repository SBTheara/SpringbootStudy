package com.springboot.newSpring.ModelStudent;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long StuId;

    @Column(name = "student_name")
    private String StuName;

    @Column(name = "student_gender")
    private String StuSex;

    @Column(name = "student_score")
    private double StuScore;

    @Column(name = "student_address")
    private String StuAddress;
}
