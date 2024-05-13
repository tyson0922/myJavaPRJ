package class0513;

class Rabbit15{
    String shape;
    int xPos, yPos;

    Rabbit15(String shape, int xPos, int yPos){
        this.shape = shape;
        this.xPos = xPos;
        this.yPos = yPos;

    }

    void show(){
        System.out.println(shape);
        System.out.println(xPos);
        System.out.println(yPos);
    }
//
//    void setPosition(int xPos, int yPos){
//        this.xPos = xPos;
//        this.yPos = yPos;
//        System.out.printf("xPosition = %d, yPosition = %d \n", xPos, yPos);
//    }
//    void shape(){
//        System.out.println(shape);
//    }
}
public class Test15{

    public static void main(String[] args){
        Rabbit15 rabbit1 = new Rabbit15("Oval", 100, 200);
//        rabbit1.setPosition(100, 200);
//        rabbit1.shape();
        rabbit1.show();

    }
}


