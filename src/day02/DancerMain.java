package day02;

// 실행용 클래스: 메인메서드를 만들어서 사용
public class DancerMain {
    public static void main(String[] args) {
        // 댄서 객체 생성
        Dancer kim = new Dancer();
        // 댄서 객체 초기화
//        kim.dancerName = "김채원";
//        kim.crewName = "르세라핌";
//        kim.genre = "아이돌";

        kim.stretch();
        kim.dance();

        System.out.println("==================");

        Dancer park = new Dancer("박지효");
        park.introduce();
        kim.introduce();

        System.out.println("==================");
        Dancer jang = new Dancer("장동민", "지니어스");
        jang.introduce();
        jang.dance();

        System.out.println("==================");
        Dancer hong = new Dancer("홍박사", "틱톡커", Genre.HIPHOP, DanceLevel.AMATEUR);
        hong.dance();
        hong.introduce();

        System.out.println(kim);
        System.out.println(park);
    }
}
