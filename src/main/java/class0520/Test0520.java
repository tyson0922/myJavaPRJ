package class0520;

class RabbitNew{
    String shape;
    int xPos, yPos;

    void move(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;

    }
    void printMove(){
        System.out.println("position : " + this.xPos + ", " + this.yPos);
    }

}
class HouseRabbitNew extends RabbitNew{
    String owner;
    void eatFeed(){
        System.out.println("집 토끼가 사료를 먹습니다.");
    }
    @Override
    void move(int xPos, int yPos){
        super.move(xPos + 500, yPos + 500);
    }
    void printHouseRabbit(){

        System.out.println("Owner : " + owner);
    }
}
class MountainRabbitNew extends RabbitNew {
    String mountain;
    void eatWildGrass(){
        System.out.println("산 토끼가 풀을 먹습니다.");

    }
    void printMountainNew(){
        System.out.println("Mountain : " +mountain);
    }
}
public class Test0520 {
    public static void main(String[] args) {
        HouseRabbitNew h1 = new HouseRabbitNew();
        MountainRabbitNew m1 = new MountainRabbitNew();

        h1.shape = "삼각형";
        h1.owner = "난쟁이";
        h1.move(100, 100);
        h1.printMove();
        h1.eatFeed();
        h1.printHouseRabbit();
        m1.shape = "네모";
        m1.mountain = "설악산";
        m1.move(200, 200);
        m1.printMove();
        m1.eatWildGrass();
        m1.printMountainNew();
    }
}
