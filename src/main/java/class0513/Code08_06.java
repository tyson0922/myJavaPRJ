package class0513;
class Rabbit135{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit4 extends Rabbit135 {
    @Override
    void move(int x, int y) {
        super.move(x, y);
        this.xPos = x;
        this.yPos = y;

        if(this.xPos > 100)
            this.xPos = 100;
        if(this.yPos > 100)
            this.yPos = 100;
    }
}
class MountainRabbit4 extends Rabbit135{

}
public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit4 hrabbit = new HouseRabbit4();
        MountainRabbit4 mrabbit = new MountainRabbit4();

        hrabbit.move(500, 500);
        mrabbit.move(500, 500);
        System.out.printf("집토끼 위치 : (%d, %d) \n", hrabbit.xPos, hrabbit.yPos);
        System.out.printf("집토끼 위치 : (%d, %d) \n", mrabbit.xPos, mrabbit.yPos);

    }
}
