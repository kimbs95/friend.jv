package day18.api.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {

        // 현재 날짜 정보 얻기 (연,월,일) - 로컬타임(운영체제시간)
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        // 특정 날짜 정보를 생성
        LocalDate targetDate = LocalDate.of(2022, 3, 9);
        System.out.println("targetDate = " + targetDate);

        // 현재 시간정보 얻기
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalTime targetTime = LocalTime.of(18, 00, 10);
        System.out.println("targetTime = " + targetTime);

        // 현재 날짜와 시간정보 얻기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        // 연도정보
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        // 월정보
        int monthValue = localDateTime.getMonthValue();  // 숫자
        System.out.println("monthValue = " + monthValue);

        Month month = localDateTime.getMonth();   // 문자
        System.out.println("month = " + month);

        // 일정보
        int dayOfMonth = localDateTime.getDayOfMonth();  // 일 정보(숫자)
        System.out.println("dayOfMonth = " + dayOfMonth);

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek(); //요일정보 (문자)
        System.out.println("dayOfWeek = " + dayOfWeek);

        int dayOfYear = localDateTime.getDayOfYear();  // 1년중 몇뻔째일 (숫자)
        System.out.println("dayOfYear = " + dayOfYear);

    }

}
