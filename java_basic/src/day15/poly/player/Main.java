package day15.poly.player;

import day13.inherit.Hunter;
import day13.inherit.Mage;
import day13.inherit.Warrior;

public class Main {

    public static void main(String[] args) {
        Mage m = new Mage("눈보라대마법사");

        Warrior w = new Warrior("전사킹워리어");
        Hunter h = new Hunter("밀렵꾼");


        m.blizzard();

        m.blizzard(w, h, m , new Mage("불꽃마법사"));

        /*
        =============================
        전사킹워리어님이 눈보라대마법사님에게 FireRush를 시전했습니다!
                눈보라대마법사(마법사)님이 20의 피해를 입었습니다.
                눈보라대마법사님의 현재 체력: 30

        전사킹워리어님이 밀렵꾼님에게 FireRush를 시전했습니다!
                밀렵꾼(사냥꾼)님이 15의 피해를 입었습니다.
                밀렵꾼님의 현재 체력: 11

        Warrior 객체 생성!
                전사킹워리어님이 키보드워리어님에게 FireRush를 시전했습니다!
                키보드워리어(전사)님이 10의 피해를 입었습니다.
                키보드워리어님의 현재 체력: 40
        */


        w.fireRush(m);
        w.fireRush(h);

        w.fireRush(new Warrior("키보드워리어"));
    }
}
