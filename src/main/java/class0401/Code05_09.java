package class0401;

import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args){
        int select;
        Scanner s = new Scanner(System.in);

        System.out.print("1~3 중에 선택하세요 : ");
        select = s.nextInt();

        switch(select) {
            case 1:
                System.out.println("1을 선택하셨습니다.");
//                break;

            case 2:
                System.out.println("2를 선택하셨습니다.");
//                break;
            case 3:
                System.out.println("3을 선택하셨습니다.");
//                break;
            default:
                System.out.println("이상한 것을 선택하셨습니다.");
        }
        s.close();
    }
}
