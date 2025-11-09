package FichaPratica2;

import java.util.Scanner;

public class Ex6 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Insira um valor:");
        valor1 = input.nextInt();

        System.out.print("Insira outro valor:");
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " " + valor2);
        } else {
            System.out.println(valor2 + " " + valor1);

        }
    }
}
