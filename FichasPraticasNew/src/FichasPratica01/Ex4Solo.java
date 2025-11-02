package FichasPratica01;

import java.util.Scanner;

public class Ex4Solo {

    public static void main() {

        Scanner input= new Scanner(System.in);

        double area, raio, pi =3.14;

        System.out.print("Insira o raio:" );
        raio= input.nextDouble();

        area=pi*raio*raio;
        System.out.println("A área da circunferência é:" +area);




    }
}
