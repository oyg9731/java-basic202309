package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String[] foods = {};
        while (true){

            String newFoods = sc.nextLine();
            if (newFoods.equals("그만")){
                break;
            }else{
                String[] a = Arrays.copyOf(foods, foods.length + 1);
                a[foods.length] = newFoods;
                foods = a;
                a = null;
            }
        }
        System.out.println(Arrays.toString(foods));
    }
}
