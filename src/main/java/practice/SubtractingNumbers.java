package practice;

import java.util.Scanner;

public class SubtractingNumbers {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Please type in two integers");
        Scanner In = new Scanner(System.in);
        x = In.nextInt();
        y = In.nextInt();
        z=x-y;
        System.out.println("The resulting subtraction of the two typed numbers are "+ z);

    }
}
