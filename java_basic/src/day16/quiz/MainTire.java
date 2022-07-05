package day16.quiz;

public class MainTire {
    public static void main(String[] args) {

        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.roll();;
        snowTire.chargeAir();
        tire.roll();
//        tire.chargeAir();  자식에서 오버라이딩 되지 않은 오리지날 메서드는 부모에서 불러올 수 없다.

    }
}
