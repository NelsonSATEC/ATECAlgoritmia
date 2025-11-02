package FichasPratica01;

import java.util.Scanner;

public class Ex6SoloTest {

    public static void main() {

        Scanner input= new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Insira o valor 1:");
        valor1= input.nextInt();

        System.out.print("Insira o valor 2:");
        valor2= input.nextInt();

        System.out.println("Troca efetuada");

        System.out.println("Valor1:" +valor2);
        System.out.println("Valor2:" +valor1);
    }
}
