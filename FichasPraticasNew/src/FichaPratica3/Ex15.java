package FichaPratica3;

import java.util.Scanner;

public class Ex15 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num, fatorial=1;

        System.out.print("Insira um número: ");
        num= input.nextInt();

        while (num>1) {
            fatorial *= num;
            num--;

        }

        System.out.println("O fatorial é= " +fatorial);


    }

}
