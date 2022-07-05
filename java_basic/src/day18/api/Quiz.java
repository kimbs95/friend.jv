package day18.api;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호: ");
        String personNum = sc.next();

        int i = personNum.indexOf("-");
        String frontNum = personNum.substring(0, i);
        String backNum = personNum.substring(i + 1);

        String genderNum = personNum.substring(i+1 , i+2);

        System.out.println("앞자리: " + frontNum);
        System.out.println("뒷자리: " + backNum);

        String myYear = frontNum.substring(0, 2);
        int year = Integer.parseInt(myYear);
        int birth = 0;
        int age;
        String gender = null;

        String month = frontNum.substring(2, 4);
        String day = frontNum.substring(4, 6);

        if (genderNum.equals("1") || genderNum.equals("3")) {
            gender = "남자";
            birth = 1900 + year;
            if (genderNum.equals("3")) {
                birth = 2000 + year;
            }
        } else if (genderNum.equals("2") || genderNum.equals("4")) {
            gender = "여자";
            birth = 1900 + year;
            if(genderNum.equals("4")) {
                birth = 2000 + year;
            }
        }
        age = 2022 - birth + 1;

        System.out.printf("%d년도 %s월 %s일생 %d세 %s", birth, month, day, age, gender);

        sc.close();
    }
}
