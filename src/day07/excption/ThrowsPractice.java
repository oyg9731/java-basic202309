package day07.excption;

import java.util.Scanner;

public class ThrowsPractice {

    public int inputNumber(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("정수만 입력하세요.");
        }
        return n;
    }

    public int convert(String s) {
        int n = 0;
        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("숫자형태의 문자만 전달하세요!");
        }
        return n;
    }
    public int inputAndConverNumber(){
        int n = 0;
        int m = 0;

        try {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return n + m;
    }
}