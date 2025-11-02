package FichasPratica01;

import java.util.Scanner;

public class Ex2Solo {

    public static void main() {

        Scanner input=new Scanner(System.in);

        double numero1, numero2, resultado;

        System.out.print("Insira um número:");
        numero1= input.nextDouble();

        System.out.print( "Insira outro número:");
        numero2= input.nextDouble();

        resultado=numero1+numero2;
        System.out.println("Soma:" +resultado);

        resultado=numero1-numero2;
        System.out.println("Subtração:" +resultado);

        resultado=numero1*numero2;
        System.out.println("Multiplicação:" +resultado);

        resultado=numero1/numero2;
        System.out.println("Divisão:" +resultado);



    }
}
