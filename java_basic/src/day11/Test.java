package day11;

//import day11.fruit.Banana;
//import day11.fruit.Grape;
// *을 붙여주면 fruit 패키지 내에 있는 모든 파일을 불러들임.
import  day11.fruit.*;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        day11.syrub.Apple a1 = new day11.syrub.Apple();
        day11.fruit.Apple a2 = new day11.fruit.Apple();

        Banana b1 = new Banana();
        Grape g1 = new Grape();

        Scanner sc = new Scanner(System.in);
    }
}
