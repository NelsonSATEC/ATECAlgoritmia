package FichaPratica3;

import java.util.Scanner;

public class Ex14 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int contador=1, quantidade, numanterior, numatual;
        boolean crescente=true;

        System.out.print("Quantos números quer: ");
        quantidade= input.nextInt();

        System.out.print("Insira um número: ");
        numanterior= input.nextInt();

        while (contador < quantidade) {

            System.out.print("Insira um número: ");
            numatual = input.nextInt();

            if (numatual <= numanterior) {
                crescente = false;
            }

            numanterior = numatual;

            contador++;

        }

        if (crescente && quantidade>1) {
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
