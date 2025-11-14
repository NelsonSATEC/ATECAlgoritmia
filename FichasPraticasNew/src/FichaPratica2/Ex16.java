package FichaPratica2;

import java.util.Scanner;

public class Ex16 {

    public static void main() {

        Scanner input= new Scanner(System.in);

        int valor, notas;

        System.out.print("Insira o valor: ");
        valor = input.nextInt();

        if (valor % 5 == 0) {

            notas = valor / 200;
            System.out.println("Notas de 200€: " + notas);

            valor = valor % 200;

            // Notas de 100
            notas = valor / 100;
            System.out.println("Notas de 100€: " + notas);

            valor = valor % 100;

            // Notas de 50
            notas = valor / 50;
            System.out.println("Notas de  50€: " + notas);

            valor = valor % 50;

            // Notas de 20
            notas = valor / 20;
            System.out.println("Notas de  20€: " + notas);

            valor = valor % 20;

            // Notas de 10
            notas = valor / 10;
            System.out.println("Notas de  10€: " + notas);

            valor = valor % 10;

            // Notas de 5
            notas = valor / 5;
            System.out.println("Notas de   5€: " + notas);

        }else {
            System.out.println("Valor inválido. Não temos trocos!");

        }


    }
}
