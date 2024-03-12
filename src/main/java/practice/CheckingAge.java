package practice;

import java.util.Scanner;

public class CheckingAge {

    public static void main(String[] args) {
        int x;
        System.out.println("Please type your age");

        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        if (x >= 19) {
            System.out.println("You are able to smoke legally in South Korea");
        }
        else {
            System.out.println("You are legally not able to smoke in South Korea");
        }

    }

}