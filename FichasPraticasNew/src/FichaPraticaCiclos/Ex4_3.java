package FichaPraticaCiclos;

public class Ex4_3 {

    public static void main() {

        int num=1;

        while (num<=9) {
            if (num!=5) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
            num++;
        }

        System.out.println();
        num=1;

        while (num<=9) {
            if (num<4 || num>6) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
            num++;
        }

        System.out.println();
        num=1;

        while (num<=9) {
            if (num<3 || num>7) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
            num++;
        }

        System.out.println();
        num=1;

        while (num<=9) {
            if (num<2 || num>8) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
            num++;
        }

        System.out.println();
        num=1;

        while (num<=9) {
            if (num<1 || num>9) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
            num++;
        }

    }

}
