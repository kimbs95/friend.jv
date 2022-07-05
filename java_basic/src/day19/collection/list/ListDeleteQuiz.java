package day19.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListDeleteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> student = new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );
        System.out.println("* 우리반 학생들의 별명: " + student);

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");
            String target = sc.nextLine();



            // 찾았는지 확인 후 삭제 진행
            if (student.contains(target)) {
                System.out.printf("%s의 별명을 삭제합니다.\n",target);

                student.remove(target);

                System.out.println("* 삭제 후 정보: "+ student);
                sc.close();
                break;

            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n",target);
            }
        }
    }
}
