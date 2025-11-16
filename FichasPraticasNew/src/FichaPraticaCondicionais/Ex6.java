package FichaPraticaCondicionais;

import java.util.Scanner;

public class Ex6 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int ano;

        System.out.print("Insira um ano: ");
        ano= input.nextInt();

        if (ano%4==0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
}
