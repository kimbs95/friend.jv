package day13.inherit;

public class Warrior extends Player {


    public int rage;


    public Warrior(String name) {
        //super();  // 자식 생성자에 숨어있는 코드
        super(name);
        System.out.println("Warrior 객체 성공!");

        this.rage = 100;
    }

    @Override // 오버라이딩 룰 검증
    public void info() {
        super.info();
        System.out.println(("# 분노: " + rage));
    }
/*
    public void fireRush(Player target) {
        System.out.println("=========================");
        System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n",this.name,target.name);
        int damage;

        if (target instanceof Mage) {
            damage = 20;
            System.out.printf("%s(마법사)님이 %d의 피해를 입었습니다.\n",target.name,damage);
            target.hp -= damage;
        } else if (target instanceof Hunter) {
            damage = 15;
            System.out.printf("%s(사냥꾼)님이 %d의 피해를 입었습니다.\n",target.name,damage);
            target.hp -= damage;
        } else if (target instanceof Warrior) {
            damage = 10;
            System.out.printf("%s(전사)님이 %d의 피해를 입었습니다.\n",target.name,damage);
            target.hp -= damage;
        }
        System.out.printf("%s님의 현재 체력: %d\n",target.name,target.hp);
    }
 */

    public void fireRush(Player target) {
        System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();
    }
}
