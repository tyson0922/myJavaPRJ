package class0415;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int a = s.nextInt();
        System.out.print("두번째 정수 : ");
        int b = s.nextInt();
        int hap = 0;
        if (a < b){
            for (int i = a; i < b +1; i++){
                if (i % 2 != 0 ){
                    hap += i;
                }
            }
        } else {
            for (int i = a; i >b -1; i--){
                if (i % 2 != 0){
                    hap += i;

                }
            }
        }
        System.out.println(hap);
    }
}
