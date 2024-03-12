package practice;

import java.util.Scanner;

public class Dividing {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("type in two numbers to divide");
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=x/y;
        System.out.println("your result is " + z);

    }
}
