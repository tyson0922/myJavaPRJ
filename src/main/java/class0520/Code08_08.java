package class0520;
abstract class RabbitNew1{
    int xPos, yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

    }
    abstract void sleep();
}
class HouseRabbitNew1 extends RabbitNew1 {
    void sleep() {
        System.out.println("집토끼가 굴속에서 잠자고 있습니다.");
    }
}
class MountainRabbitNew1 extends RabbitNew1 {
    void sleep(){
        System.out.println("산토끼가  굴속에서 잠자고 있습니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbitNew1 hRabbit = new HouseRabbitNew1();
        MountainRabbitNew1 mRabbit = new MountainRabbitNew1();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
