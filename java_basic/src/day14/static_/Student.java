package day14.static_;

public class Student {

    String major;
    static String nationality = "Korea";

    void WhatMajor() {
        System.out.println("myMajor: " + this.major);
    }
    static void WhatNationality(Student whoAsk) {
        System.out.println("whoAskMajor: " + whoAsk.major);
        System.out.println("myNationality: " + nationality);
    }

    public static void main(String[] args) {
        Student kim = new Student();
        Student park = new Student();

        kim.major = "경영학";
        park.major = "물리학";

        kim.WhatMajor();
        System.out.println("============================");
        Student.WhatNationality(kim);
    }
}
