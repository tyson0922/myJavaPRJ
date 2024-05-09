package class0507;
class Rabbit5{
    private String shape;
    private  int xPos;
    private int yPos;

    void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit5 rabbit = new Rabbit5();
        rabbit.setPosition(100, 200);
    }

}
