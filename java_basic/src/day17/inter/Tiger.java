package day17.inter;

public class Tiger extends Animal implements Huntable{


    int grade;    //  쳔연기념물 등급


    @Override
    public void hunt(String target) {
        System.out.println("호랑이는 은밀하게 사냥해요~");
    }

    @Override
    public void eat() {

    }
}
