package class0507;
class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}
public class Code07_06 {

    public static void main(String[] args) {

        Rabbit rb1 = new Rabbit();
        rb1.setPosition(100, 100);
        Rabbit rb2 = new Rabbit();
        rb2.setPosition(200, 200);
    }
}
