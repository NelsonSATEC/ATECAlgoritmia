package FichaPratica3;

import java.util.Scanner;

public class Ex11 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int numinicial=0, numlimite, incremento;

        System.out.print("Insira o limite: ");
        numlimite= input.nextInt();

        System.out.print("Insira o salto: ");
        incremento= input.nextInt();

        while (numinicial <= numlimite) {
            System.out.println(numinicial);
            numinicial=numinicial+incremento;

        }

    }

}
