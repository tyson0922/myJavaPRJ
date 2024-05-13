package class0513;
class Rabbit134{
    private String shape;
    int xPos, yPos;

    private void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
}
class HouseRabbit3 extends Rabbit134 {
    String owner;
    void eatFeed(){
        System.out.println("집 토끼가 사료를 먹습니다.");
    }
}

public class Code08_05 {
    public static void main(String[] args) {
        HouseRabbit3 hRabbit = new HouseRabbit3();
        hRabbit.owner = "난생이";
        hRabbit.eatFeed();
        hRabbit.xPos = 100;
        hRabbit.yPos = 100;
    }
}
