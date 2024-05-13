package class0513;
class Rabbit132{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
}
class HouseRabbit1 extends Rabbit132 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit1 extends Rabbit132 {
    String mountain;
    void eatWildgrass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_03 {
    public static void main(String[] args) {
        HouseRabbit1 hRabbit = new HouseRabbit1();
        MountainRabbit1 mRabbit = new MountainRabbit1();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난생이";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.mountain = "설악산";
        mRabbit.move(200, 200);
        mRabbit.eatWildgrass();
    }
}
