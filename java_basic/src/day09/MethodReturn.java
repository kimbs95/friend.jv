package day09;

import java.util.Arrays;
import java.util.Random;

public class MethodReturn {

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void showAdd(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    // void 에서의 return 은 단독으로 써야하며 함수를 강제종료시킴.
    static void callNickName(String nick) {
        if (nick.length() > 5) {
            System.out.println("이름이 너무 기네~~ 즐~~!");
            return;
        }
        System.out.println(nick + " 하위~~~~");
    }

    // 모든 함수의 리턴값은 반드시 1개임.
    // 여러개의 값을 리턴하고 싶을 때!

    // 5개의 애완동물 목록이 있는데, 원하는 숫자를 전달하면
    // 랜덤으로 해당 숫자만큼의 애완동물을 골라서 반환하고 싶다!
    static String[] selectPet(int count) {
        String[] pets = {"멍멍이", "짹짹이", "야옹이", "꽥꽥이", "꾸러기"};

        if (count > 5 || count < 1) {
            System.out.println("1 ~ 5사이로 입력하십시오~~");
            return null;
        }
        Random r = new Random();
        String[] selected = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = r.nextInt(pets.length);
            selected[i] = pets[rn];
        }
        return selected;
    }

    public static void main(String... args) {
        
        int r1 = add(10, 20);
        int r2 = r1 * 3 + r1--;
        
        showAdd(10, 20);
//        int r3 = showAdd(10, 20);    void 함수는 리턴이없으니까 이렇게 못써요
        
        showAdd(add(5, 3), add(7, 2));
//        add(showAdd(1, 1), showAdd(5, 5));  void 함수는 다른 함수의 인수값으로 주면 안됩니다.

        System.out.println("=============================================");
        
        callNickName("뽀로로");
        callNickName("삐리빠라뽀리리");

        System.out.println("=============================================");

        String[] sel = selectPet(2);
        System.out.println(Arrays.toString(sel));
    }
}
