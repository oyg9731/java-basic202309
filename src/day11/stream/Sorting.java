package day11.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {

        // 음식 목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("========================");
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        // 300 칼로리보다 큰 요리 중에 top3 필터링
        System.out.println("========================");
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);
    }
}
