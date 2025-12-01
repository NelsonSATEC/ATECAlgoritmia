package FichaPratica3;

import java.util.Scanner;

public class Ex12 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num=0;
        int intervalo0025=0, intervalo2650=0, intervalo5175=0, intervalo76100=0;

        while (num>=0) {

            System.out.print("Insira um número (colocar negativo para terminar a contagem): ");
            num= input.nextInt();

            if (num>=0 && num<=25) {
                intervalo0025++;
            }

            if (num>=26 && num<=50) {
                intervalo2650++;
            }

            if (num>=51 && num<=75) {
                intervalo5175++;
            }

            if (num>=76 && num<=100) {
                intervalo76100++;
            }

        }

        System.out.println( "[00,25]: "  +intervalo0025);
        System.out.println( "[26,50]: "  +intervalo2650);
        System.out.println( "[51,75]: "  +intervalo5175);
        System.out.println( "[76,100]: "  +intervalo76100);
    }

}
