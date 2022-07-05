package com.kh.example.practice4.model.vo;

public class Student {

    public int grade;
    public int classroom;
    public String name;
    public double height;
    public char gender;

    public Student(int sGrade, int sClassroom, String sName, double sHeight, char sGender) {
        grade = sGrade;
        classroom = sClassroom;
        name = sName;
        height = sHeight;
        gender = sGender;
    }

    public void information() {
        System.out.printf("%d학년 %d반 이름: %s, 키: %.1fcm, 성별: %s", grade, classroom, name, height, gender);
    }
}
