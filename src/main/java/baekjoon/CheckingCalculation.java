package baekjoon;

import java.util.Scanner;

public class CheckingCalculation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.print( ((A%C) * (B%C))%C);

    }
}
