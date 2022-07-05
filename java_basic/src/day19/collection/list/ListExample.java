package day19.collection.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        // 리스트: 순차형 자료구조, 데이터가 순서대로 저장, 중복저장 허용
//    String[] sArr = new String[10];

        // 배열 리스트 생성 - 초기생성시 10개짜리로 자동 생성
        // 데티어 추가 삭제시 자동으로 공간조정
        List<String> sList = new ArrayList<>();

        // add() : 리스트에 객체를 추가
        sList.add("멍멍이");
        sList.add("야옹이");
        sList.add("짹쨲이");
        sList.add("두껍이");
        sList.add("개굴이");
        sList.add("깍깍이");

        System.out.println(sList.toString());
        System.out.println(sList);

        // size() : 저장된 객체의 수 리턴
        int size = sList.size();
        System.out.println("저장된 객체의 수 리턴 - size = " + size);

        // add(index, object) : 중간 삽입
        sList.add(2, "어흥이");
        System.out.println("중간삽입 - " + sList);

        // set(index, obj) : 객체 수정
        sList.set(3, "메롱이");
        System.out.println("수정 - " + sList);

        // remove(index), remove(obj)
        sList.remove(1);
        System.out.println("인덱스로 삭제 -" + sList);
        sList.remove("개굴이");
        System.out.println("obj로 삭제 - " + sList);

        // get(index) : 리스트에서 객체 참조
        String s = sList.get(2);
        System.out.println("리스트에서 객체 참조 - s = " + s);

        // indexOf(obj) : 저장 객체의 인덱스 탐색   [없는 객체는 -1 리턴]
        int index = sList.indexOf("어흥이");
        System.out.println("저장 객체의 인덱스 탐색 - index = " + index);

        // contains(obj) : 객체의 저장 유무 확인
        boolean flag = sList.contains("귀뚜라미");
        System.out.println("객체의 저장 유무 확인 - flag = " + flag);

        // list의 반복문 처리
        System.out.println("====================================");
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        System.out.println("======================================");
        for (String str : sList) {
            System.out.println(str);
        }

        System.out.println("======================================");
        // clear() : 리스트 내부 객체 전체 삭제
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());  // 저장객체가 0 개면 true

        // 초기값을 가진 리스트
        // ex) int[] arr = {10, 20, 30};
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30, 5, 8, 56, 2)
        );

        System.out.println(numbers);

        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("오름차 정렬 - " + numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("내림차 정렬 - " + numbers);

    }
}
