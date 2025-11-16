package FichaPraticaCondicionais;

import java.util.Scanner;

public class Ex4 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        String letra;

        System.out.println("Insira uma letra minúscula: ");
        letra= input.next();

        switch (letra) {

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("É uma vogal");
                break;

            default:
                System.out.println("Se realmente tiver escolhido uma letra, é uma consoante, senão vai ter de estudar");
                break;
        }


    }
}
