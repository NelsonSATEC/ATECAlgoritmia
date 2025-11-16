package FichaPraticaCondicionais;

import java.util.Scanner;

public class Ex2 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        double peso, pesolua;

        System.out.print("Insira o seu peso (Kg): ");
        peso= input.nextDouble();

        if (peso>0) {

            pesolua = peso * 0.16;
            System.out.println("O seu peso na Lua é de " + pesolua + "Kg");
        } else {
            System.out.println("Insira um peso maior do que 0Kg");

        }

    }
}
