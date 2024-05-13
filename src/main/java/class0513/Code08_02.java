package class0513;
class Rabbit131{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
}
class HouseRabbit extends Rabbit131 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit extends Rabbit131 {
    String mountain;
    void eatWildgrass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_02 {
    public static void main(String[] args) {

    }

}
