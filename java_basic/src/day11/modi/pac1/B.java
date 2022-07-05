package day11.modi.pac1;

public class B {

    public B() {
        A a = new A();
        a.f1 = 1; a.f2 = 2;
        // a.f3 = 3; 접근제한자가 private 라서 다른 클래스면 안됩

        a.m1(); a.m2();
        // a,m3();     접근제한자가 private 라서 다른 클래스면 안됩
    }
}
