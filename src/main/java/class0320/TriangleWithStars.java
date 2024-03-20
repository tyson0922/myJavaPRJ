package class0320;

public class TriangleWithStars {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 7; i++) {
            if (i <= 3) {
                for (j = 0; j <= i; j++)
                    System.out.print("*");
            } else {
                for (j = 0; j <= 6 - i; j++) {
                    System.out.print("*");

                }
            }
            System.out.println();
        }

    }
}
