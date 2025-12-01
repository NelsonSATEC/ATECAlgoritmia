package FichaPratica3;

import java.util.Scanner;

public class Ex15alt {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num, fatorial=1, soma=0, multiplicador, contador;

        System.out.print("Insira um número: ");
        num= input.nextInt();

        while (num>1) {
            soma=0;
            multiplicador=fatorial;
            contador=num;

            while (contador>0) {
                soma+=multiplicador;
                contador--;
            }
            fatorial=soma;
            num--;

        }

        System.out.println("O fatorial é= " +fatorial);

    }

}
