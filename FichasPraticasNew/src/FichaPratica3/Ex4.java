package FichaPratica3;

import java.util.Scanner;

public class Ex4 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int numinserido, numinicial=0;

        System.out.print("Insira um número inteiro:");
        numinserido= input.nextInt();

        while (numinserido>=numinicial){
            System.out.println(numinicial);
            numinicial=numinicial+1;
        }

    }
}
