package com.springboot.newSpring.ModelStudent;

public class Student {
    private int StuId;
    private String StuName;
    private String StuSex;
    private double StuScore;
    private String StuAddress;
    public Student(){}
    public Student(int stuId, String stuName, String stuSex, double stuScore, String stuAddress) {
        StuId = stuId;
        StuName = stuName;
        StuSex = stuSex;
        StuScore = stuScore;
        StuAddress = stuAddress;
    }

    public int getStuId() {
        return StuId;
    }

    public void setStuId(int stuId) {
        StuId = stuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getStuSex() {
        return StuSex;
    }

    public void setStuSex(String stuSex) {
        StuSex = stuSex;
    }

    public double getStuScore() {
        return StuScore;
    }

    public void setStuScore(double stuScore) {
        StuScore = stuScore;
    }

    public String getStuAddress() {
        return StuAddress;
    }

    public void setStuAddress(String stuAddress) {
        StuAddress = stuAddress;
    }
}
