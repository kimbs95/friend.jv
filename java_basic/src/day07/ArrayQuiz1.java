package day07;

import java.util.Scanner;

public class ArrayQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요.");

        int student;
        while (true) {
            student = sc.nextInt();
            if (student <= 81 && student >= 1) {
                break;
            } else {
                System.out.print("1 ~ 80 사이로 입력해주세요.");
            }
        }
        int[] point = new int[student];
        System.out.printf("%d명의 점수를 입력해주세요.\n", student);

        for (int i = 0; i < point.length; i++) {
            System.out.printf("%d번 : ", i + 1);
            point[i] = sc.nextInt();
        }
        System.out.println("\n--- 분포 그래프 ---");



    }//end main
}//end class
