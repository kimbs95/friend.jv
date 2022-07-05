package day13.inherit;

public class Hunter extends Player {


    int arrowCount;


    public Hunter(String name) {
        super(name);
    }

    @Override // 오버라이딩 룰 검증
    public void info() {
        System.out.println("\n=========== 캐릭터 정보 =============");
        System.out.println("# 아이디: " + name);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
        // 위에 4줄은 부모 player 의 info 와 같기때문에 부모의 메서드를 super.info(); 로 불러올 수 있다
        // super.info();
        System.out.println(("# 화살: " + arrowCount));
    }

    public void frozenShot() {

    }


}
