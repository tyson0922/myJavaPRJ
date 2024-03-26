package class0326;

public class TriangleWithStar {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 0;
        c = 0;
        for (a = 1; a < 8; a++) {
            b = 8 - a;
            c = Math.abs((b - a) / 2);
            if (c == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();


        for (a = 1; a < 8; a++) {
            b = 8 - a;
            c = Math.abs((b - a) / 2);
            if (c == 0 || c == 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (a = 1; a < 8; a++) {
            b = 8 - a;
            c = Math.abs((b - a) / 2);
            if (c == 0 || c == 1 || c ==2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (a = 1; a < 8; a++) {
            b = 8 - a;
            c = Math.abs((b - a) / 2);
            if (c == 0 || c == 1 || c == 2|| c == 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
