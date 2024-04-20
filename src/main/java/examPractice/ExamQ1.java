package examPractice;

public class ExamQ1 { //ExamQ1이라는 클래스입니다.
    public static void main(String[] args){ //프로기램 실행 매서드
        for (int i=0; i <4; i++){ // 초기값 0부터 시작 조건식 4보다 작을때 까지 행을 1개씩 만듦. 조건식 i<4를 만족 못하면 for문을 종료함
            for(int j=1; j <8; j++){
                /*칸수가 7개여서 1~7개 칸을 만듬 초기값 1부터 시작 조건식 8보다 작을때 까지 칸을 1개씩 만듦. 조건식 j<8을 만족 못하면,
                i for 문으로 돌아감.
                 */
                if (4-i <= j && j <= 4+i){
                    /*
                    별이 찍히는 걸 보면 처음은 4번째 칸에, 두번째는 3에서 5 칸에, 세번째는 2에서 6 칸에, 네번째는 1에서 6 칸에 자리에
                    별이 찍힘.  j가 4-i 보다 크거나 같을 때와 j가 4+i 보다 작거나 같을 때 별이 찍힘.
                     */
                    System.out.print("*"); //별찍히는 조건을 만족해서 별을 출력.

                } else { //별찍히는 조건을 만족안하면
                    System.out.print(" "); //빈칸을 출력
                }
            } //for 문의 j 조건으로 돌아감.
            System.out.println();//println 때문에 다음줄로 바뀜. 그리고 for 문의 i 조건씩으로 다시 돌아감.
        }
    }
}