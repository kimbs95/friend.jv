package day13.inherit;

public class Player extends Object {
// 상속을 안넣어주면 자동으로 extends Object 가 자동으로 들어가있지만 보이진 않음
    public String name;
    public int level;
    public int hp;
    public int exp;
//    private int exp;     # private 은 상속대상에서 제외됨

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 50;
    }

    public void info() {
        System.out.println("\n=========== 캐릭터 정보 =============");
        System.out.println("# 아이디: " + name);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
    public void attack() {
        System.out.println(name + "님이 공격합니다.");
    }



}
