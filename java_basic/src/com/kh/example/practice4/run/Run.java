package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
    public static void main(String[] args) {

        Student s = new Student(6,5,"김철수", 160.0, '남');

        s.information();
    }
}
