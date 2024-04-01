package class0401;
import java.util.Scanner;
public class ScannerUse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num < 100){
            System.out.print("100보다");
            System.out.print("작군요");
        }
        s.close();
    }
}
