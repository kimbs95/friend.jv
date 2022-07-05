package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("~~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
        System.out.println("=======================================");

        System.out.println("~~~~~~~~~~ 난이도를 설정합니다! ~~~~~~~~~~");
        System.out.println("[ 1. 상 (1~100) | 2. 중 (1~50) | 3. 하 (1~20) ]");
        System.out.print(">> ");
        int level = sc.nextInt();

        int max = 0;
        if (level == 1) {
            max = 100;
            System.out.println("상 난이도로 설정 됩니다!! [ 1 ~ 100 ]");
        } else if (level == 2) {
            max = 50;
            System.out.println("중 난이도로 설정 됩니다!! [ 1 ~ 50 ]");
        } else if (level == 3) {
            max = 20;
            System.out.println("하 난이도로 설정 됩니다!! [ 1 ~ 20 ]");
        } else {
            max = 1000;
            System.out.println("잘못 입력 하셨습니다. 지옥 난이도로 자동 설정 됩니다!! [ 1 ~ 1000 ]");
        }

        int qNum = 1;
        int win = 0,lose = 0;

        while (true) {
            int number1 = r.nextInt(max) + 1;
            int number2 = r.nextInt(max) + 1;

            int operationNum = r.nextInt(3) + 1;
            String mark;

            int real;
            if (operationNum == 1) {
                mark = "+";
                real = number1 + number2;
            } else if (operationNum == 2) {
                mark = "-";
                if (number1 == number2) {
                    number2 = number1 - 1;
                } else if (number1 < number2) {
                    int n = number1;
                    number1 = number2;
                    number2 = n;
                }
                real = number1 - number2;
            } else {
                mark = "x";
                real = number1 * number2;
            }

            System.out.printf("Q%d. %d %s %d = ??\n", qNum, number1, mark, number2);
            System.out.print(">> ");
            int answer = sc.nextInt();

            if (answer == 0) {
                System.out.println("게임을 종료합니다!");
                break;
            }
            if (answer == real) {
                System.out.println("정답입니다!");
                win++;
            } else {
                System.out.println("틀렸어요~");
                lose++;
            }

            qNum++;
        }
        System.out.printf("정답횟수 : %d회, 틀린횟수 : %d회", win, lose);
    }
}
