package FichaPratica5;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("______________________________");

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if ((vetor[i] > maior) && (vetor[i]%2==0)) {
                maior = vetor[i];
            }


        }

        System.out.println("Maior: " + maior);

    }

}
