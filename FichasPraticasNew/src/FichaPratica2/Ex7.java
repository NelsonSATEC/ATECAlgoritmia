package FichaPratica2;

import java.util.Scanner;

public class Ex7 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Insira um valor:");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ìmpar");

        }
    }
}
