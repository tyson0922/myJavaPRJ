package baekjoon;

import java.util.Scanner;

public class Multiplying {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int num1, num2, num3;
        num1 = b / 100;
        num2 = (b - num1*100) / 10 ;
        num3 = b - num1*100 - num2 *10;
        System.out.println(a * num3);
        System.out.println(a * num2);
        System.out.println(a * num1);
        System.out.println(a * b);
    }
}
