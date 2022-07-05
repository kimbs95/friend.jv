package project;

import java.util.Scanner;

public class TeamProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("===== 성적 관리 프로그램 ======");
        System.out.println("학생수를 입력하세요.");
        System.out.print(">> ");
        int studentsNum = sc.nextInt();
        sc.nextLine();

        String[] name = new String[studentsNum];
        int[] kor = new int[studentsNum];
        int[] eng = new int[studentsNum];
        int[] mat = new int[studentsNum];
        int[] total = new int[studentsNum];
        double[] avg = new double[studentsNum];
        String[] grade = new String[studentsNum];

        for (int i = 0; i < studentsNum; i++) {
            System.out.print("이름을 입력하세요 : ");
            name[i] = sc.nextLine();
            System.out.print("국어점수를 입력하세요 : ");
            kor[i] = sc.nextInt();
            System.out.print("영어점수를 입력하세요 : ");
            eng[i] = sc.nextInt();
            System.out.print("수학점수를 입력하세요 : ");
            mat[i] = sc.nextInt();
            sc.nextLine();

            total[i] = kor[i] + eng[i] + mat[i];
            avg[i] = (((double) total[i]) / 3);

            if (avg[i] >= 90) {
                grade[i] = "A";
                System.out.printf("%s님의 학점은 %s 입니다.",name[i], grade[i]);
            } else if (avg[i] >= 80) {
                grade[i] = "B";
                System.out.printf("%s님의 학점은 %s 입니다.\n",name[i], grade[i]);
            } else if (avg[i] >= 70) {
                grade[i] = "C";
                System.out.printf("%s님의 학점은 %s 입니다.\n",name[i], grade[i]);
            } else if (avg[i] >= 60) {
                grade[i] = "D";
                System.out.printf("%s님의 학점은 %s 입니다.\n",name[i], grade[i]);
            } else {
                System.out.printf("%s님은 보충수업이 필요합니다.!\n",name[i]);
            }
            System.out.printf("국어 : %d | 영어 : %d | 수학 : %d | 총점 : %d | 평균 : %.2f\n", kor[i], eng[i], mat[i], total[i], avg[i]);
        }

    }
}
