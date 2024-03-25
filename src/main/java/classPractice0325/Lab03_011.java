package classPractice0325;
import java.util.Scanner;
public class Lab03_011 {
    public static void main(String[] args){
//        파운드(lb)를 입력하세요: 15
//        15.0파운드(lb)는 6.80....킬로그램(kg)입니다.
//        킬로그램(kg)을 입력하세요: 15
//        15.0킬로그램(kg)은 33.00000.....파운드(lb)입니다.
        Scanner s = new Scanner(System.in);
        System.out.print("파운드(lb)를 입력하세요: ");
        double pound = s.nextDouble();
        double kg = 0.453592 * pound;
        System.out.println("\n" + pound + "파운드(lb)는 " + kg + "킬로그램(kg)입니다.");
        System.out.print("킬로그램(kg)을 입력하세요: ");
        kg = s.nextDouble();
        pound = 2.204623 * kg;
        System.out.println("\n" + kg + " 킬로그램(kg)은 " + pound + "파운드(lb)입니다.");


    }
}
