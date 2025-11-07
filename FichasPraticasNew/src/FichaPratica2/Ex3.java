package FichaPratica2;

import java.util.Scanner;

public class Ex3 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Insira o salário em euros:");
        salario = input.nextDouble();

        if (salario <= 15000) {
            System.out.println("A taxa a pagar será de 20% e terá de descontar " + salario * 0.20 + "€");
        } else if ((salario > 15000) && (salario <= 20000)) {
            System.out.println("A taxa a pagar será de 30% e terá de descontar" + salario * 0.30 + "€");
        } else if ((salario > 20000) && (salario <= 25000)) {
            System.out.println("A taxa a pagar será de 35% e terá de descontar" + salario * 0.35 + "€");
        } else if ((salario > 25000))
            System.out.println("A taxa a pagar será de 40% e terá de descontar" + salario * 0.40 + "€");
    }





}