package day04.modi.pac1;

public class B {
   public B(){
       A a = new A();
       new A(10);

       a.f1 = 1;
       a.f2 = 2;

       a.m1();
       a.m2();
   }
}
