package day05.poly.car;

import day05.final_.Parent;
import util.Utility;

public class Main {

    public static void main(String[] args) {

        Avante avante = new Avante();
        Car avante2 = new Avante();
        Car mustang = new Mustang();
        Car stinger = new Stinger();

        Car[] cars = {avante, avante2, mustang, stinger};
        for (Car c : cars) {
            c.accelerate();
        }

        Object[] arr = {"hello", "안녕", 10, false};

        Utility.makeLine();

        Driver park = new Driver();
        park.drive(new Stinger());

        Utility.makeLine();
        CarShop shop = new CarShop();

        Mustang myCar = (Mustang) shop.exportCar(6000);
        myCar.accelerate();
        myCar.exhaust();

        Car[] myCarList = {myCar, avante};

        int x = 10;
        double[] dArr = {x};

        // 객체의 다운캐스팅은 전제조건이 있음
        // 한번 업캐스팅이 된 자식객체만 다시 다운캐스팅 가능
        Utility.makeLine();

        Car myStinger = new Stinger();
        Stinger ss = (Stinger) myStinger;

//        Car car = new Car();
//        Avante aaa = (Avante) car;

        Utility.makeLine();

        Car carcar = shop.exportCar(6000);

        System.out.println(carcar instanceof Avante);
        System.out.println(carcar instanceof Stinger);
        System.out.println(carcar instanceof Mustang);

        if (carcar instanceof Mustang) {
            Mustang ms = (Mustang) carcar;
            ms.exhaust();
        }
    }
}
