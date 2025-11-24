package FichaPratica3;

import java.util.Scanner;

public class Ex6 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int numinicial, numlimite;

        System.out.print("Insira o primeiro número:");
        numinicial= input.nextInt();

        System.out.print("Insira o segundo número:");
        numlimite= input.nextInt();

        while (numlimite>=numinicial) {
            System.out.println(numinicial);
            numinicial=numinicial+1;
        }

    }
}
