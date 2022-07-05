package day11.player;

public class Player {

    public String name;  //  닉네임
    public int level;  // 레벨
    public int hp;   // 체력

    public Player() {
        this("이름없음", 1);   // this 는 생성자 내부 첫줄에 위치해야합니다 // 나의 생성자에 접근하겠습니다.
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
        System.out.println("1번 생성자!");

    }
    // 매개변수가 지역변수와 이름이 같을때 ex) name = name    = >  this.name = name  으로 가능
    public Player(String name) {
        this(name, 1);
        System.out.println("2번 생성자!");

    }
    public Player(String name, int level) {
        System.out.println("3번 생성자!");
        this.name = name;
        this.level = level;
        this.hp = 50;
    }

                        // Player this 숨어있음
    public void attack(Player this, Player target) {
        System.out.println("this = " + this);
        System.out.println("target = " + target);   // name 앞에 this 숨어있음
        System.out.printf("%s님이 %s님을 공격합니다.\n", name, target.name);
        target.hp -= 10;
        this.hp -= 5;
    }
}
