package com.kh.hw.member.model.vo;

import static java.lang.String.format;

public class Member {

    private String id;
    private String name;
    private String password;
    private String email;
    private char gender;
    private int age;

    // ========================= 생성자 영역 =========================//
    public String inform() {
        return String.format("# Id:%s / Name:%s / Password:%s / Email:%s / Gender:%c / Age:%d",id,name,password,email,gender,age);
    }

    public Member() {

    }

    public Member(String id, String name, String password, String email, char gender, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }


    // ========================= 메서드 영역 =========================//
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() < 7 && id.length() > 4) {
            this.id = id;
        } else {
            return;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
