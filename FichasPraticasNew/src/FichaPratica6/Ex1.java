package FichaPratica6;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numescolhido, numinicial;

        do {

            System.out.print("Escolha um número inteiro e positivo: ");
            numescolhido = input.nextInt();
        } while (numescolhido<=0);

        for (numinicial = 1; numinicial <= numescolhido; numinicial++) {
                System.out.print("*");
        }
    }
}

