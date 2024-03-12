package practice;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Please type in two numbers");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z=x+y;
        System.out.println("the sum of your typed numbers are " + z);

    }
}
