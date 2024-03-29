package day02;

public class Dancer {
    // 객체의 속성 (필드)
    String dancerName;// 댄서 이름
    String crewName;// 팀 이름
    Genre genre;// 장르
    DanceLevel danceLevel; // 댄스 수준 (0: 초보, 1: 중수, 2: 고수)

    // 생성자 선언 : 개체의 초기값을 세팅
    // 생성자도 함수의 일종, 리턴테이가 주소값으로 고정
    // 따라서 리턴 타입을 적지 않음.
    Dancer(){
        dancerName = "김채원";
        crewName = "르세라핌";
        danceLevel = DanceLevel.AMATEUR;
        genre = Genre.URBAN;
    }
    Dancer(String dName){
        dancerName = dName;
        crewName = "트와이스";
        genre = Genre.STREET;
    }
    Dancer(String dName, String Cname){
        dancerName = "dName";
        crewName = "Cname";
        danceLevel = DanceLevel.BEGINNER;
        genre = Genre.KPOP;
    }

    public Dancer(String dancerName, String crewName, Genre genre, DanceLevel danceLevel) {
        this.dancerName = dancerName;
        this.crewName = crewName;
        this.genre = Genre.STREET;
        this.danceLevel = DanceLevel.PRO;
    }

    // 객체의 기능 (메서드) : static을 붙이지 말 것
    // 춤추는 기능
    void dance(){
        System.out.println(genre + "춤을 열정적으로 춥니다.");
    }
    // 스트레칭을 하는 기능
    void stretch(){
        System.out.println(dancerName + "님이 몸을 풉니다.");
    }
    void introduce(){
        System.out.printf("내 이름은 %s이고 %s팀에 소속되어 있습니다. \n",
                dancerName, crewName);
    }
}
