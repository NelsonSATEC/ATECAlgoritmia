package FichasPratica01;

import java.util.Scanner;

public class Ex1Solo {

    public static void main() {

        Scanner input = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.print( "Insira um número:");
        numero1=input.nextInt();

        System.out.print( "Insira outro número:");
        numero2=input.nextInt();

        soma=numero1 + numero2;

        System.out.println("Soma:" +soma);


    }
}
