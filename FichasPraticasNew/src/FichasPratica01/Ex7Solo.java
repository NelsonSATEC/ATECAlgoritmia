package FichasPratica01;

import java.util.Scanner;

public class Ex7Solo {

    public static void main() {

        Scanner input= new Scanner(System.in);

        double preco1, preco2, preco3, precoTotal, precoFinal;

        System.out.print("Insira o preço do produto 1:");
        preco1=input.nextDouble();

        System.out.print("Insira o preço do produto 2:");
        preco2=input.nextDouble();

        System.out.print("Insira o preço do produto 3:");
        preco3=input.nextDouble();

        precoTotal=preco1+preco2+preco3;
        System.out.println("Preço sem Desconto:" +precoTotal);

        precoFinal=preco1*0.90+preco2*0.90+preco3*0.90;
        System.out.println("Preço com desconto:" +precoFinal);



    }
}
