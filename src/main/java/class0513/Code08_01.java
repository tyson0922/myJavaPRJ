package class0513;
class Rabbit13{
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit13(){
        count++;
    }
}
public class Code08_01 {
    public static void main(String[] args) {
        System.out.println("객제 생성 전의 총 토끼 수 ==> " +Rabbit13.count);

        Rabbit13 rabbit1  = new Rabbit13();
        System.out.println("토끼 갯체1 생성 후의 총 토끼 수 ==> " +Rabbit13.count);

        Rabbit13 rabbit2  = new Rabbit13();
        System.out.println("토끼 갯체1 생성 후의 총 토끼 수 ==> " +Rabbit13.count);
    }
}
