package day09;

import java.util.Arrays;

public class MethodQuiz1Sol {

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
    static void remove(String targetFood) {

        if (!include(targetFood)) {
            System.out.println("대상이 존재하지 않아 삭제할 수 없습니다.");
            return;
        }
        // 삭제대상의 인덱스
        int idx = indexOf(targetFood);
        for (int i = idx; i < foods.length -1; i++) {
            foods[i] = foods[i + 1];
        }

        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
    }

    // 음식명을 입력하면 음식이 배열에 저장 되었는지 여부 확인
    static boolean include(String checkFood) {
        return indexOf(checkFood) != 1;
    }

    // 삽입 함수
    static void insert(int insertIdx, String newFood) {

        if (insertIdx < 0 || insertIdx > foods.length - 1) {
            System.out.println("인덱스 범위가 잘못됨!");
            return;
        }
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = temp.length - 1; i > insertIdx; i--) {
            temp[i] = temp[i - 1];
        }
        temp[insertIdx] = newFood;
        foods = temp;
    }

    // 수정 함수
    static void modify(int modifyIdx, String modifyFood) {
        if (modifyIdx < 0 || modifyIdx > foods.length - 1) {
            System.out.println("인덱스 범위가 잘못됨!");
            return;
        }
        foods[modifyIdx] = modifyFood;
    }

    // 배열의 모든 값 삭제 메서드
    static void clear() {
        foods = new String[0];
    }


    public static void main(String[] args) {


        push("볶음밥");
        printArray(foods);

        push("라면");
        printArray(foods);

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
        printArray(foods);

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

    private static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
