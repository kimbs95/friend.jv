package day15.poly.car;

public class Sonata extends Car{


    @Override   // @override 붙이면 확인가능
    public void run() {
        System.out.println("소나타가 달립니다");
    }

    public void joinSonataClub() {
        System.out.println("소나타 동호회에 가입합니다.");
    }


}
