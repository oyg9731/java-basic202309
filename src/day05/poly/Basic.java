package day05.poly;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {
    void test() {
        // 다양성: 자식객체가 부모의 타입을 사용할 수 있다.
        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();
        A e = new E();
    }
}

