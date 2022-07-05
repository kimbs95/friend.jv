package day03;

import java.util.Scanner;

public class ScannerQuiz {

    public static void main(String[] args) {

        Scanner market = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");

        System.out.print("- 상품의 가격: ");
        int price = market.nextInt();

        System.out.print("- 상품의 개수: ");
        int amount = market.nextInt();

        System.out.println("========================");

        System.out.printf("- 상품 재고 총액: %d원",price * amount);

        market.close();
    }
}
