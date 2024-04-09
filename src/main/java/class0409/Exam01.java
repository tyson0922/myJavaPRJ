package class0409;

import java.util.Scanner;


public class Exam01{
    public static void main(String[] args){
        int a, b;
        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 : ");
        a = s.nextInt();
        System.out.print("두 번째 : ");
        b = s.nextInt();

        if (a > b){
            System.out.println(a + "는 " + b + "보다 큽니다.");
        }

        else if (a == b){
            System.out.println(a + "는 " + b + "와 같습니다.");
        }

        else {
            System.out.println(a + "는 " + b + "보다 작습니다.");
        }
        s.close();
    }
}