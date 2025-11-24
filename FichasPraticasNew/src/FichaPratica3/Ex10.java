package FichaPratica3;

import java.util.Scanner;

public class Ex10 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int numinicial=2, numint;

        System.out.print("Insira um número maior que 2: ");
        numint= input.nextInt();

        while (numinicial<=numint) {
            System.out.println(+numinicial);
            numinicial=numinicial+2;
        }

    }
}
