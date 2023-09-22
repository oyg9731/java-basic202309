public class Main {
    // 메서드 cal
    static int cal(int asd){
        int total = 0;
        for (int i = 0; i <= asd; i++) {
//            total = total + i;
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        int result = cal(10);
        System.out.println(result);
    }
}