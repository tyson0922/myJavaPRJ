package class0401;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("자연수를 입력하세요: ");
        a = s.nextInt();
        if (a%21 == 0){
            System.out.println("3과 7의 배수입니다.");
        } else if (a%3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (a%7 == 0){
            System.out.println("7의 배수입니다.");
        } else {
            System.out.println("조건에 만족하지 않습니다.");
        }
    }
}
