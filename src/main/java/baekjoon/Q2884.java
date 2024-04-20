package baekjoon;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();
        if (minute < 45){
            if (hour == 0){
                hour = 23;
                minute = 60 - (45-minute);
                System.out.print(hour + " " + minute);
            } else {
                hour -= 1;
                minute = 60 - (45-minute);
                System.out.print(hour + " " + minute);
            }
        } else {
            minute -= 45;
            System.out.print(hour + " " + minute);
        }
    }
}
