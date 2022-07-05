package day18.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Manipulate {

    public static void main(String[] args) {

        // 대여 일자
        LocalDate orderDate = LocalDate.now();
        // 반남 예정일자 (3일뒤)
        LocalDate returnDate = orderDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        // 행사 시작일
        LocalDate start = LocalDate.of(2022, 5, 27);
        // 행사 종료일
        LocalDate end = start.plusDays(15);
        System.out.println("end = " + end);

        LocalDate date = start.plusYears(1).plusMonths(10).plusDays(3);
        System.out.println("date = " + date);

        String str = "hello";
        char c = str.toUpperCase().replace("H", "z").substring(2).charAt(0);
        System.out.println("c = " + c);

        /*  ######## 같은 스트링 타입으로 리턴이 되기 떄문에 위에 처럼 간단히 쓸 수 있음
        마지막은 타입이 char 이기 때문에 끝
        String s = str.toUpperCase();
        String s1 = s.replace("H", "z");
        String s2 = s1.substring(2);
        char c1 = s2.charAt(0);
        */

        LocalDate hireDate = LocalDate.of(2020, 10, 15);
        LocalDate exitDate = LocalDate.of(2021, 7, 19);

        // 사이 날짜 연산
        long between = ChronoUnit.DAYS.between(hireDate, exitDate);
        System.out.println("between = " + between);


    }
}
