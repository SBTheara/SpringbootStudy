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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int StuId;
    private String StuName;
    private String StuSex;
    private double StuScore;
    private String StuAddress;
}
