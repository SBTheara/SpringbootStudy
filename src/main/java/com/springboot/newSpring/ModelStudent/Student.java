package com.springboot.newSpring.ModelStudent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int StuId;
    private String StuName;
    private String StuSex;
    private double StuScore;
    private String StuAddress;
}
