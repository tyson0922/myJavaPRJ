package class0507;
class Rabbit2{
    String shape;
    int xPos;
    int yPos;
    Rabbit2(){
        shape = "토끼";
    }

    Rabbit2(String shape){
        this.shape = shape;
    }
    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
public class Code07_10 {
    public static void main(String[] args) {
        String rabbitColor = "파란색";
        Rabbit2 rabbit= new Rabbit2();
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);
        Rabbit2 rabbit2 = new Rabbit2("빨간 토끼");
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit2.shape);
        Rabbit2 rabbit3 = new Rabbit2(rabbitColor);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit3.shape);
    }
}
