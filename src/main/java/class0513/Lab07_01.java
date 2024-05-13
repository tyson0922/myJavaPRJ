package class0513;

import java.util.Scanner;

class Rabbit0701{
    int xPos, yPos;
    void ScanRabbitCord(){

    }
    void setPosition() {
        Scanner s = new Scanner(System.in);
        System.out.print("토끼가 이동할 X좌표 ==> ");
        int xPos = s.nextInt();
        System.out.print("토끼가 이동할 Y좌표 ==> ");
        int yPos = s.nextInt();
        this.xPos = xPos;
        this.yPos = yPos;

        System.out.printf("** 토끼의 현재 위치는 (%d, %d)입니다.", xPos, yPos);
    }
}
public class Lab07_01 {
    public static void main(String[] args) {
        Rabbit0701 r1 = new Rabbit0701();
        r1.setPosition();
    }

}
