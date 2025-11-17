package Javardice;

import java.util.Scanner;

public class TesteDoAmor {

    public static void main() {

        Scanner input = new Scanner(System.in);

        String amor1, amor2;
        int resultado = (int) (Math.random() * 101);

        System.out.println("_____ Teste do Amor <3<3<3<3<3 _____");

        System.out.print("Insere o teu nome: ");
        amor1 = input.next();

        System.out.print("Insere o nome do teu amor: ");
        amor2 = input.next();

        if ((amor1.equals("telmo") && amor2.equals("rato")) || (amor1.equals("rato") && amor2.equals("telmo"))) {
            System.out.println("O amor é mais de 100%!!!! <3");
        } else {
            System.out.println("O vosso nível de amor é " +resultado +"%");
        }
    }

}
