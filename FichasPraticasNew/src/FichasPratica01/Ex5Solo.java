package FichasPratica01;

import java.util.Scanner;

public class Ex5Solo {

    public static void main() {

        Scanner input= new Scanner(System.in);

        double nota1, nota2, nota3, mediaAritmetica, mediaPonderada;

        System.out.print("Insira a primeira nota:");
        nota1= input.nextDouble();

        System.out.print("Insira a segunda nota:");
        nota2= input.nextDouble();

        System.out.print("Insira a terceira nota:");
        nota3= input.nextDouble();

        mediaAritmetica=(nota1+nota2+nota3)/3;
        System.out.println("A Média Aritmética é:" + mediaAritmetica);

        mediaPonderada=nota1*0.20+nota2*0.30+nota3*0.50;
        System.out.println("A Média Ponderada é:" +mediaPonderada );

    }
}
