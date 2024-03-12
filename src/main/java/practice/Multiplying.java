package practice;

import java.util.Scanner;

public class Multiplying {
    public static void main(String[] args){
        int x,y,z;
        System.out.println("Type in two numbers");
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=x*y;
        System.out.println("your resulting multiplied number is " + z);

    }
}
