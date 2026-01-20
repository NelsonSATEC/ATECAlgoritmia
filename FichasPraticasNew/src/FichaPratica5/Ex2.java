package FichaPratica5;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double[] comissao=new double[12];

        for (int m=0; m<comissao.length; m++) {
            System.out.print("Comissão do mês " + m + ": ");
            comissao[m] = input.nextDouble();
        }

        double total=0;

        for (int m=0; m<comissao.length; m++) {
            total=total+comissao[m];
        }

        System.out.println("Total ao ano: " +total);

    }

}
