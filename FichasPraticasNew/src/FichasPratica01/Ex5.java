package FichasPratica01;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaAritmetica, mediaPonderada;

        System.out.print("Nota1:");
        nota1 = input.nextDouble();

        System.out.print("Nota2:");
        nota2 = input.nextDouble();

        System.out.print("Nota3:");
        nota3 = input.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        System.out.println( "A média das notas é:" +mediaAritmetica);
        









    }
}
