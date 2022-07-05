package day08;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int[][] scores = {
                {80, 90, 85, 95},
                {90, 60, 75, 85},
                {95, 90, 85, 55}
        };

        System.out.println("scores.length = " + scores.length);
        System.out.println("scores[1][1] = " + scores[1][1]);
        System.out.println("Arrays.toString(scores[2]) = " + Arrays.toString(scores[2]));

        // 첫번째 배열 안에는 2번째 배열의 주소값이 들어가 있습니다.
        System.out.println(Arrays.toString(scores));

        System.out.println("===========================================");

        // 데이터 수정
        scores[1][2] = 90;

        scores[2] = new int[] {100, 100, 100, 100};


        // 바깥쪽 배열에서 안쪽 배열추출하고 안쪽 배열에서 정수를 추출
        for (int[] arr : scores) {
            for (int n : arr) {
                System.out.printf("%d ",n);
            }
            System.out.printf("\n");
        }

        System.out.println("===========================================");

        // 배열 생성문으로 2차원 배열 만들기 (3 x 5)
        int[][] arr2d = new int[3][5];

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.printf("\n");
        }

        // 3차원 배열
        int[][][] arr3d = {
                { {1,1,1},{2,2,7},{3,3,3} },
                { {4,4,4},{3,3,3},{2,220,2} },
                { {1,1,1},{2,2,2},{5,5,5} }
        };
        System.out.println(arr3d[1][2][1]);

        for (int[][] ints : arr3d) {
            for (int[] anInt : ints) {
                for (int i : anInt) {

                }
            }
        }


    }
}
