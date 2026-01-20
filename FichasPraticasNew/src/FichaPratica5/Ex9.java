package FichaPratica5;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        int soma=0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                soma=soma + matriz[linha][coluna];
            }
        }
        System.out.println(+soma);
    }
}
