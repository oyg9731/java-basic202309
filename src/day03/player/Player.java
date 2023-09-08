package day03.player;

public class Player {
    // field
    String nickName;
    int level;
    int hp;

    public Player() {
        System.out.println("1번 생성자 호출!");
        this.nickName = "이름없음";
        this.level = 1;
        this.hp = 50;
    }
    public Player(String nickName) {
        System.out.println("2번 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("3번 생성자 호출!");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    // method
    void attack(Player target) {
        System.out.println("this = " + this);
        System.out.println("target = " + target);
        System.out.printf("%s님이 %s님을 공격했습니다.\n",
                this.nickName,  target.nickName);
    }


}
