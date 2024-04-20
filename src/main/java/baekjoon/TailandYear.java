package baekjoon;

import java.util.Scanner;

public class TailandYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tailandYear = s.nextInt();
        int koreanYear = tailandYear - 543;
        System.out.print(koreanYear);
    }

}
