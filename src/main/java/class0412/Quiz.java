package class0412;

import java.util.Scanner; //Scanner 클래스를 사용하기 위해 불러옵니다.

public class Quiz {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //Scanner 객체 s를 준비합니다.
        System.out.print("첫번째 정수를 입력하세요: "); //정수를 입력하라고 알려줍니다.
        int a = s.nextInt(); //변수a를 키보드로 입력받아요.
        System.out.print("두번째 정수를 입력하세요: "); //정수를 입력하라고 알려줍니다.
        int b = s.nextInt(); //변수b를 키보드로 입력받아요.
        int hap = 0; //변수 hap에 정수 0의 값을 대입합니다.
        for (int i = a; i <=b; i++){ //정수 변수 i에 a 값을 대입합니다.
            // i가 b의 값보다 클때 for문에서 빠져나옵니다. for문안에 있는 것을 실행하고 i의 값을 1로증가 합니다.
            if(i % 2 != 0){ //i가 2와 나누어 떨어지지 않을때 ..
                hap += i; //hap = hap + i를 실행합니다.
            }
        }
        System.out.println(a + "부터 " + b + "까지 반복하여 홀수의 합계는 " + hap +"입니다."); // 실행한 값을 출력합니다.
    }
}
