package baekjoon;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a >89){
            System.out.print("A");
        } else if (a > 79){
            System.out.print("B");
        }else if (a > 69){
            System.out.print("C");
        }else if (a > 59){
            System.out.print("D");
        }else {
            System.out.print("F");
        }
    }
}
