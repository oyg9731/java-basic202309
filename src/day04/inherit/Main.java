package day04.inherit;

public class Main {
    public static void main(String[] args) {

//        new Player("zz");

        Warrior w = new Warrior("주차오항");
        Mage m = new Mage("일렉트릭");
        Hunter H = new Hunter("으쌔신헌터");

        System.out.println(w.getNickName());
//
        w.status();
        m.status();
        H.status();

        System.out.println("=================");
        new Student();

    }
}
