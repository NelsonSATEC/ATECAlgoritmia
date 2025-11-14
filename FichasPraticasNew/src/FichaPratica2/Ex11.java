package FichaPratica2;

import java.util.Scanner;

public class Ex11 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        double saldo, movimento, novosaldo;

        System.out.print("Insira o seu saldo:");
        saldo= input.nextDouble();

        System.out.print("Valor a movimentar (Crédito/Débito):");
        movimento= input.nextDouble();

        novosaldo= saldo + movimento;

        System.out.println("_____________________________________________");

        if (novosaldo > 0) {

            if (movimento > 0) {
                System.out.println("Crédito efectuado com sucesso;");
            } else {
                System.out.println("Levantamento efectuado com sucesso;");
            }

            saldo = novosaldo;

        }else {
            System.out.println("Operação Inválida, Saldo Insuficiente");
        }

        System.out.println("Saldo após operação é de "  + saldo + "€");





    }
}
