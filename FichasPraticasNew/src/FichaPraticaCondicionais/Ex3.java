package FichaPraticaCondicionais;

import java.util.Scanner;

public class Ex3 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        double preco, preco10;

        System.out.print("Preço (€):");
        preco= input.nextDouble();

        if (preco>100) {
            preco10 = preco * 0.90;
            System.out.println("O preço com 10% de desconto é de " + preco10 + "€");
        } else {
            System.out.println("O preço é de" +preco +"€");
        }

    }
}
