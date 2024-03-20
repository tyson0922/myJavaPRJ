package class0320;

public class TriangleWithStars {

    public static void main(String[] args){
        int i;
        String str = "*";
        for (i = 0; i < 5; i++){
            if (i < 4) {
                System.out.println(str);
                str = str + "*";
            }
            else {
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
            }
        }
    }
}
