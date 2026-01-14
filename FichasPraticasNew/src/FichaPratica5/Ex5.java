package FichaPratica5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[] vetor= new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("___________________________________");

        int soma=0;

        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        double media=soma / vetor.length;
        System.out.println("Média: " +media);
    }

}
