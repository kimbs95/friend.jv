package day13.protec.pac1;

public class A {

    protected int f1;
    int f2;   //제한자를 아무것도 입력안하면 default 제한

    public A() {}
    protected A(int a) {}
    A(double b) {}

    protected void m1() {}
    void m2() {} //제한자를 아무것도 입력안하면 default 제한
}
