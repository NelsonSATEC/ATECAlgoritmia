package FichaPratica4;

import java.util.Scanner;

public class Ex3 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num, divisor=1;

        System.out.print("Insira um número: ");
        num= input.nextInt();

        System.out.println("Os divisores são: ");

        for (divisor=1; divisor<=num; divisor++) {
            if (num%divisor==0) {
                System.out.println(divisor);
            }

        }

    }

}
