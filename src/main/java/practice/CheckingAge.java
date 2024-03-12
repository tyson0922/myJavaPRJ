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
            System.out.println("It is illegal for you to smoke in South Korea");
        }

    }

}