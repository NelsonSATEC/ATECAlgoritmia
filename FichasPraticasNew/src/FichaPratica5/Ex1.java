package FichaPratica5;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int n = 0; n < vetor.length; n++) {
            System.out.print("Insira no vetor[" + n + "]: ");
            vetor[n] = input.nextInt();
        }


        System.out.println(".................................");

        for (int n = 0; n < vetor.length; n++) {
            System.out.println("vetor [" + n + "]: " + vetor[n]);
        }
    }

}
