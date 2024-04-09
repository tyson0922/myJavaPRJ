package class0409;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        for ( int i = a ; i <= b ; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        if (a > b) {
            for (int i = a; i >= b; i--) {
                if (i % 3 ==0){
                    System.out.println(i);
                }
            }
        }
    }
}
