package FichaPratica3;

import java.util.Scanner;

public class Ex9 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int numero=0, soma=1, contador=-1, media;

        while (numero!=-1) {
            System.out.print("Insira um número: ");
            numero= input.nextInt();

            soma=soma+numero;
            contador=contador+1;
        }
        media=soma/contador;

        System.out.println("Média: " +media);

    }
}
