package baekjoon;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();
        int cookTime = s.nextInt();

        if (minute + cookTime > 59){
            minute += cookTime;
            hour += (minute / 60);
            minute %= 60;
            if (hour >23){
              hour -= 24;
            }
            System.out.println(hour + " " + minute);
        } else{
            minute += cookTime;
            System.out.println(hour + " " + minute);
        }
    }
}
