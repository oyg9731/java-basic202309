package day01;

public class DataType {
    public static void main(String[] args) {

        // 1 byte == 8bit
        // -128 ~ 127
        // 951112-6234456
         byte a = 10;

         // 2byte == 16bit
         short b = 32767;

         // 4byte
         int c = 2147483647;

         // 8byte
        long d = 2147483648L;

        float e = 3.14f; // 4byte - 소수점 7자리
        System.out.println("e = " + e);
        
        boolean b1 = true;
        boolean b2 = false;

        // 2byte 65=A, 97=a 44033=가
        char cc = '가';
        System.out.println("cc = " + cc);
        
        // 문자열 (문자 배열)
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("str = " + new String(str));

        // 스트링은 기본(원시)타입이 아닙니다.
        String s = "hello";

//        Date dddd = new Date();
    }
}
