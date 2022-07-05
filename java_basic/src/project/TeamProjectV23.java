package project;

import java.util.Scanner;

public class TeamProjectV23 {

    static Scanner sc = new Scanner(System.in);
    // 학생이름을 넣는 빈 배열
//    static String[] studentName = new String[0];
    // 국어점수를 넣는 빈 배열
//    static int[] scoreKor = new int[0];
    // 영어점수를 넣는 빈 배열
//    static int[] scoreEng = new int[0];
    // 수학점수를 넣는 빈 배열
//    static int[] scoreMat = new int[0];
    // 총점을 넣는 빈 배열
//    static int[] scoreTotal = new int[0];
    // 평균을 넣는 빈 배열
//    static double[] scoreAvg = new double[0];

    // 테스트용 임시 입력값
    static String[] studentName = new String[] {"최","김","aa","bb"};
    static int[] scoreKor = new int[] {99,88,87,25};
    static int[] scoreEng = new int[] {88,66,58,99};
    static int[] scoreMat = new int[] {77,44,87,100};

    static int scoreTotal;
    static double scoreAvg;



    // 점수 입력시 0 ~ 100 까지만 가능하게 하는 함수
    static int overScore(String message) {
        while (true) {
            System.out.printf(message);
            int point = sc.nextInt();
            if (point > 100 || point < 0) {
                System.out.println("점수범위는 0 ~ 100 입니다.");
                continue;
            }
            return point;
        }
    }

    // 성적입력함수 case1
    static void case1() {
        System.out.print("이름을 입력하세요 : ");
        pushName(sc.next());

        int kor = overScore("국어점수를 입력하세요 : ");
        scoreKor = pushIntArray(scoreKor, kor);

        int eng = overScore("영어점수를 입력하세요 : ");
        scoreEng = pushIntArray(scoreEng, eng);

        int math = overScore("수학점수를 입력하세요 : ");
        scoreMat = pushIntArray(scoreMat, math);

    }

    // 성적확인함수 case2
    static void case2() {
        System.out.print("성적을 확인할 학생의 이름을 입력하세요 : ");
        String checkStudentScore = sc.next();
        int index = indexOf(checkStudentScore);

        if (index != -1) {
            System.out.printf("%s의 성적을 확인합니다.\n",checkStudentScore);
            System.out.printf("국어점수 : %d\n",scoreKor[index]);
            System.out.printf("영어점수 : %d\n",scoreEng[index]);
            System.out.printf("수학점수 : %d\n",scoreMat[index]);
            scoreTotal = scoreKor[index] + scoreEng[index] + scoreMat[index];
            scoreAvg = (double) scoreTotal / 3;
            System.out.printf("총점 : %d | 평균 : %.2f\n", scoreTotal, scoreAvg);
        } else {
            System.out.printf("%s은(는) 없는 이름입니다.\n",checkStudentScore);
        }
    }

    // 성적수정함수 case3
    static void case3() {
        System.out.print("성적을 수정할 학생의 이름을 입력하세요 : ");
        String modifyStudentScore = sc.next();
        int modifyIndex = indexOf(modifyStudentScore);

        if (modifyIndex != -1) {
            System.out.println("수정할 과목을 선택하세요.");
            System.out.println("1. 국어 | 2. 영어 | 3. 수학 | 4. 전체수정");
            System.out.print(">> ");
            int modifySelect = sc.nextInt();

            if (modifySelect == 1) {
                int modKor = overScore("국어 점수를 수정합니다.\n>> ");
                scoreKor = modify(scoreKor, modifyIndex, modKor);

            } else if (modifySelect == 2) {
                int modEng = overScore("영어 점수를 수정합니다.\n>> ");
                scoreEng = modify(scoreEng, modifyIndex, modEng);

            } else if (modifySelect == 3) {
                int modMat = overScore("수학 점수를 수정합니다.\n>> ");
                scoreMat = modify(scoreMat, modifyIndex, modMat);

            } else if (modifySelect == 4) {
                System.out.println("*****모든 점수를 수정합니다.*****");
                int modKor = overScore("국어 점수를 수정합니다.\n>> ");
                scoreKor = modify(scoreKor, modifyIndex, modKor);

                int modEng = overScore("영어 점수를 수정합니다.\n>> ");
                scoreEng = modify(scoreEng, modifyIndex, modEng);

                int modMat = overScore("수학 점수를 수정합니다.\n>> ");
                scoreMat = modify(scoreMat, modifyIndex, modMat);
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            System.out.printf("%s은(는) 없는 이름입니다.\n",modifyStudentScore);
        }
    }

    // case4 전체 학생 점수 조회
    static void case4() {
        if (studentName.length > 0) {
            System.out.println("***** 모든 학생의 점수를 조회합니다 *****");

            for (int i = 0; i < studentName.length; i++) {
                System.out.printf("# %d, <%s>의점수\n국어 : %d점 | 영어 : %d점 | 수학 : %d점\n", i+1, studentName[i], scoreKor[i], scoreEng[i], scoreMat[i]);
                scoreTotal = scoreKor[i] + scoreEng[i] + scoreMat[i];
                scoreAvg = (double) scoreTotal/ 3;
                System.out.printf("총점 : %d점 | 평균 : %.2f점\n", scoreTotal, scoreAvg);

            }
        } else {
            System.out.println("등록된 데이터가 없습니다.");
        }
    }


    // studentName 배열에 새로운 데이터를 끝에 추가하는 함수
    static void pushName(String newName) {
        String[] temp = new String[studentName.length + 1];
        for (int i = 0; i < studentName.length; i++) {
            temp[i] = studentName[i];
        }
        temp[temp.length - 1] = newName;
        studentName = temp;
    }

    // 각 점수 배열에 새로운 데이터를 끝에 추가하는 함수 (int 만 가능)
    static int[] pushIntArray(int[] iArr, int newScore) {
        int[] temp = new int[iArr.length + 1];
        for (int i = 0; i < iArr.length; i++) {
            temp[i] = iArr[i];
        }
        temp[temp.length - 1] = newScore;
        return temp;
    }

    // studentName 의 인덱스 번호를 찾는 함수
    static int indexOf(String targetStudent) {
        int index = -1;
        for (int i = 0; i < studentName.length; i++) {
            if (targetStudent.equals(studentName[i])) {
                index = i;
                break;
            }
        } // end for
        return index;
    }

    // 수정할 점수의 함수
    static int[] modify(int[] iArr,int modifyIdx, int modifyScore) {
        if (modifyIdx < 0 || modifyIdx > iArr.length - 1) {
            System.out.println("인덱스 범위가 잘못됨!");
        } else {
            iArr[modifyIdx] = modifyScore;
        }
        return iArr;
    }
////////////////*********************main 실행부********************////////////////////

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            //메뉴 출력
            System.out.println("         =========================== 성적 관리 프로그램 ===========================");
            System.out.println("1. 학생 성적 입력 || 2. 학생 성적 확인 || 3. 학생 성적 수정 || 4. 전체 학생 조회 || 5. 프로그램 종료");
            System.out.print(">> ");
            int scoreMenu = sc.nextInt();

            if (scoreMenu == 5) {
                break;
            }
            switch(scoreMenu) {
                case 1:
                    case1();
                    break; // end case1
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");

            } // end switch
        }//end while

    }
}
