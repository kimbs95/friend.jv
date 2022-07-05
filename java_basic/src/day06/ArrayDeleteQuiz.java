package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(tvxq));

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");
            String searchName = sc.nextLine();

            // 탐색
            int index = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (searchName.equals(tvxq[i])) {
                    index = i;
                    break;
                }
            }
            // 찾았는지 확인 후 삭제 진행
            if (index != -1) {
                System.out.printf("%s의 별명을 삭제합니다.\n",searchName);

                // 삭제 알고리즘
                for (int i = index; i < tvxq.length - 1; i++) {
                    tvxq[i] = tvxq[i + 1];
                }

                String[] temp = new String[tvxq.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = tvxq[i];
                }
                tvxq = temp; temp = null;
                System.out.println("* 삭제 후 정보: "+ Arrays.toString(tvxq));
                sc.close();
                break;

            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n",searchName);
            }
        }
    }
}
