package baekjoon;

import java.util.Scanner;

public class AddAB {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
        s.close();
    }
}
