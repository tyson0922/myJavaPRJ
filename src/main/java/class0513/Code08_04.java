package class0513;
class Rabbit133{
    int xPos;
    int yPos;
    Rabbit133(){
        System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호출됩니다.");

    }
    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + xPos+ " / yPos : " + yPos);
    }
}
class HouseRabbit2 extends Rabbit133 {
    HouseRabbit2(){
        System.out.println("2. 서브 클래스(집토끼)의 생성자가 호출됩니다.");
    }
}
public class Code08_04 {
    public static void main(String[] args){
        HouseRabbit2 hRabbit = new HouseRabbit2();
    }
}
