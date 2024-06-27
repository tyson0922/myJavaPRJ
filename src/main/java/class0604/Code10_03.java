package class0604;
class result {

}
public class Code10_03 {
    int result;
    public  int plus (int v1, int v2){

        result = v1 + v2;
        int v3 = v1 * v2;
        return result;

    }

    public static void main(String[] args) {

        Code10_03 d = new Code10_03();

        int hap;
        hap = d.plus(100, 200);

        System.out.println("100과 200의 plus() 메서드 결과 : " + hap);
    }
}
