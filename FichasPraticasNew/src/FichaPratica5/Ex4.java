package FichaPratica5;

import java.util.Scanner;

public class Ex4 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int[] vetor= new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("___________________________________");

        int menor=vetor[0];

        for(int i=0;i< vetor.length; i++) {

            if (vetor[i] < menor) {
                menor=vetor[i];
            }
        }

        System.out.println("Menor:" +menor);


    }

}
