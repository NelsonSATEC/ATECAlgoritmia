package FichaPratica2;

import java.util.Scanner;

public class Ex4 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        int classificacao;

        System.out.print("Insira Número de Lugar na Classificação:");
        classificacao = input.nextInt();

        if (classificacao == 1) {
            System.out.println("A sua pontuação é de 10 pontos");
        } else if (classificacao == 2) {
            System.out.println("A sua pontuação é de 8 pontos");
        } else if (classificacao == 3) {
            System.out.println("A sua pontuação é de 6 pontos");
        } else if (classificacao == 4) {
            System.out.println("A sua pontuação é de 5 pontos");
        } else if (classificacao == 5) {
            System.out.println("A sua pontuação é de 4 pontos");
        } else if (classificacao == 6) {
            System.out.println("A sua pontuação é de 3 pontos");
        } else if (classificacao == 7) {
            System.out.println("A sua pontuação é de 2 pontos");
        } else if (classificacao == 8) {
            System.out.println("A sua pontuação é de 1 pontos");
        } else if (classificacao >= 9) {
            System.out.println("A sua pontuação é de 0 pontos");}
    }
}
