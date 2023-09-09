package day04.inherit;

public class Mage extends Player{

    private int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    public void blizzard() {
        System.out.println("눈보라를 시전합니다.");
    }

    @Override // 오버라이딩 규칙을 맞췄는지 검증
    public void status(){
        super.status();
        System.out.println("# 마나: " + mana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
