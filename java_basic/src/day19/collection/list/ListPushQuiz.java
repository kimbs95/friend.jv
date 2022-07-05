package day19.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListPushQuiz {

    public static void main(String[] args) {


        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        // String[] foodList = new String[0];
        // String[] foodList = {};     빈배열은 위에랑 이거랑 둘중 하나 사용가능

        List<String> foodList = new ArrayList<>();

        while (true) {
            System.out.print("> ");
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) break;

            foodList.add(newFood);

            // 배열에 신규 데이터가 들어갈 공간 확보
            // String[] temp = new String[foodList.length + 1];

            // 기존 데이터 복사
            //for (int i = 0; i < foodList.length; i++) {
            //    temp[i] = foodList[i];
            //}
            // 신규데이터 마지막 인덱스에 추가
            //temp[temp.length - 1] = newFood;

            //foodList = temp;
            //temp = null;
        } // end while

        System.out.println("먹고 싶은 음식리스트: " + foodList );
        sc.close();

    } // end main
} // end class
