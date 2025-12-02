package FichaPratica4;

import java.util.Scanner;

public class Ex7 {

    public static void main() {

        Scanner input= new Scanner(System.in);

        int num, qtddivisores=0, divisor=1;

        System.out.print("Insira um número: ");
        num= input.nextInt();

        if (num<=1) {
            System.out.println("Não é número primo.");

        }else{

            for (divisor=1; divisor<=num; divisor++) {
                if (num%divisor==0) {
                    qtddivisores++;
                }
            }
            if (qtddivisores==2) {
                System.out.println("O número escolhido é primo.");
            } else {
                System.out.println("O número não é primo.");

            }
        }


    }

}
