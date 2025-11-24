package FichaPratica3;

import java.util.Scanner;

public class Ex5 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num=1, limite;
        String mensagem;

        System.out.print("Quantas vezes queres que a mensagem se repita: " );
        limite=input.nextInt();

        System.out.print("Mensagem: ");
        input.nextLine();
        mensagem= input.nextLine();

        while (num<=limite) {
            System.out.println(mensagem);
            num=num+1;
        }

    }
}
