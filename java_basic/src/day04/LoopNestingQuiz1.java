package day04;

import java.util.Scanner;

public class LoopNestingQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("옆으로 긴 직사각형을 그립니다.");
        System.out.print("한 변(1) : ");
        int first = sc.nextInt();
        System.out.print("한 변(2) : ");
        int second = sc.nextInt();

        sc.close();

        // 가로, 세로 길이를 결정
        int width, height;
        if (first > second) {
            width = first;
            height = second;
        } else {
            width = second;
            height = first;
        }

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }


    }
}
