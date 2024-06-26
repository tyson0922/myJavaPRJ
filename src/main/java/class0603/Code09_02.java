package class0603;

import java.util.Scanner;

public class Code09_02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;
        int hap2 = 0;
        System.out.print("숫자 : ");
        numAry[0] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[1] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[2] = s.nextInt();
        System.out.print("숫자 : ");
        numAry[3] = s.nextInt();
        System.out.print("숫자 : ");

        hap = numAry[0] + numAry[1] +numAry[2]+ numAry[3];
        for (int j : numAry) {
            hap2 += j;
        }
//        for (int i = 0; i <numAry.length; i++){
//            hap2 += numAry[i];
//        }
        System.out.println("합계 ==> " + hap);
        System.out.println("합계2 ==> " + hap2);

        s.close();
    }
}
