package day11.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링
public class FilterApple {

    /**
     * @return - 녹색 사과만 필터링된 바구니
     * @solution - try1 : 사과바구니에서 녹색사과들만 필터링하자
     * @problem - 만약에 다른 색깔의 사과를 필터링해야한다면???
     * 새로운 메서드를 생성해야 함
     * @param1 basket - 전체 사과가 들어있는 바구니
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 녹색사과만 담을 바구니
        List<Apple> greenBasket = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }


    /**
     * @solution - try2: 색상을 파라미터화한다.
     * @problem - 만약에 필터 기준이 색상이 아니라 무게라면?
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {
        // 필터된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try3: 동작을 파라미터화 하면 해결된다.
     *                   - 함수를 전달받을 수 있다면?
     *                   - 자바는 함수를 전달할 수 있나?
     *                    -> 불가능 자바의 함수는 일급객체 아니다.
     *                    -> 함수개념이 아니라 객체에 소속된 메서드 개념
     *                   - 그런데 전달되는 함수가 고정되어 있는가>
     *                    -> 필터 조건에 따라 함수 내용이 다르다.
     *                    -> 그러면 어떻게 함수 이름이 통일되면서
     *                       다른 내용을 전달할 수 있을까?
     *                       -> 오버라이딩(상속, 인터페이스)
     *
     * @problem - 사과만 필터링 할 수 있음.
     *            다른 과일이나, 전자제품은 필터링 불가능
     */

    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate predicate) {
        // 필터된 사과만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if (predicate.test(apple)) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }
    /**
     * @solution - try4 : 제너릭 필드 메서드 생성
     */
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> predicate) {
        // 필터된 사과만 담을 바구니
        List<T> filteredBasket = new ArrayList<>();
        // 반복문을 통해 필터링
        for (T t : basket) {
            if (predicate.test(t)) {
                filteredBasket.add(t);
            }
        }
        return filteredBasket;
    }
}
