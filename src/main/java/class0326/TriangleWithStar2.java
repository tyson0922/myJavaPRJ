package class0326;

public class TriangleWithStar2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        /*
        0001000     네번째 자리에
        0011100
        0111110
        1111111
         */
        for (d = 0; d < 4; d++) {
            for (a = 1; a < 8; a++) {
                b = 8 - a;
                c = Math.abs((b - a) / 2);
                if (c <= d) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


