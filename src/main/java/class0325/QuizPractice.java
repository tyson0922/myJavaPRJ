package class0325;
import java.util.Scanner;

public class QuizPractice {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("type in a number: ");
        int num = s.nextInt();

        System.out.println("your number is : " + num);


        System.out.println("type in a floating number : ");
        double num1 = s.nextDouble();
        System.out.println("your floating number is : " + num1);

        System.out.println("type in a string");
        String str = s.nextLine();
        System.out.println("Your floating number is : " + str);

        System.out.println("type in a integer");
        String str2 = s.nextLine();
        int num3 = Integer.parseInt(str2);
        System.out.println(num3);
        s.close();
    }
}
