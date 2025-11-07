package FichaPratica2;

import java.util.Scanner;

public class Ex2 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Insira o salário em euros:");
        salario= input.nextDouble();

        if (salario<=15000) {
            System.out.println("A taxa a pagar será de 20% e terá de descontar " +salario*0.20 +"€");
        } else {
            System.out.println("A taxa a pagar será de 30% e terá de descontar" +salario*0.30 +"€");

        }




    }
}
