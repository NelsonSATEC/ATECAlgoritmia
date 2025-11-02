package FichasPratica01;

import java.util.Scanner;

public class Ex3Solo {

    public static void main() {

        Scanner input = new Scanner(System.in);

        double ladoa, ladob, area, perimetro;

        System.out.print("insira um dos lados:");
        ladoa = input.nextDouble();

        System.out.print( "Insira o outro lado:");
        ladob= input.nextDouble();

        perimetro=ladoa+ladoa+ladob+ladob;
        System.out.println( "perimetro=" +perimetro);

        area=ladoa*ladob;
        System.out.println("Área:" +area);



    }
}
