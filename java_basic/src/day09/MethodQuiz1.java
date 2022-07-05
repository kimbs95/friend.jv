package day09;

import java.util.Arrays;

public class MethodQuiz1 {

    static String[] foods = {"치킨", "파스타", "짬뽕"};

    // foods 배열에 새로운 데이터를 끝에 추가하는 함수
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    // foods의 인덱스 번호를 찾는 메서드
    static int indexOf(String search) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (search.equals(foods[i])) {
                index = i;
                break;
            }
        } // end for
        return index;
    }

    // 삭제 메서드
    static String remove(String targetFood) {
        // 탐색

        // int idx = indexOf(targetFood);  위의 indexOF의 함수를 이용할수있음
        int index = -1;
        for (int i = 0; i <foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // 삭제 알고리즘
            for (int i = index; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }

            String[] temp = new String[foods.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];
            }
            foods = temp; temp = null;
        } else {
            System.out.printf("%s는(은)존재하지 않는 음식명입니다.\n",targetFood);
        }
        return targetFood;
    }

    // 추가 메서드
    static String insert(int insertIdx, String newFood) {
        String[] temp = new String[foods.length + 1];

        // 2. 기존 데이터를 전부 복사
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        // 3. 끝데이터부터 뒤로 밀기
        for (int i = temp.length - 1; i > insertIdx; i--) {
            temp[i] = temp[i - 1];
        }
        // 4. 타겟인덱스에 데이터 추가
        temp[insertIdx] = newFood;
        // 5. 주소 변경
        foods = temp; temp = null;

        return newFood;
    }
    // 수정 메서드
    static String modify(int modifyIdx, String modifyFood) {
        foods[modifyIdx] = modifyFood;
        return modifyFood;
    }

    // 배열의 모든 값 삭제 메서드
    static void clear() {
        foods = null;
    }

    static boolean include(String checkFood) {
        int index = -1;
        for (int i = 0; i <foods.length; i++) {
            if (checkFood.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return true;
    }



    public static void main(String[] args) {


        push("볶음밥");
        System.out.println(Arrays.toString(foods));

        push("라면");
        System.out.println(Arrays.toString(foods));

        System.out.println("=========================");

        // 1리턴
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);

        // 3리턴
        int idx2 = indexOf("볶음밥");
        System.out.println("idx2 = " + idx2);

        // -1리턴
        int idx3 = indexOf("망고");
        System.out.println("idx3 = " + idx3);

        System.out.println("==========================");

        remove("볶음밥");   // foods 배열에서 볶음밥 제거
        remove("망고");    // 존재하지 않는 음식명입니다 출력
        System.out.println(Arrays.toString(foods));

        System.out.println("==========================");

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        System.out.println(Arrays.toString(foods));

        System.out.println("==========================");

        modify(2, "닭갈비"); // 2번 인덱스 데이터 닭갈비로 수정
        System.out.println(Arrays.toString(foods));

        System.out.println("==========================");

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        System.out.println(flag);

        System.out.println("==========================");

        clear(); // foods 배열 모든 데이터 삭제
        System.out.println(Arrays.toString(foods));


    }
}
