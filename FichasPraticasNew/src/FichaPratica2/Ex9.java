package FichaPratica2;

import java.util.Scanner;

public class Ex9 {

    public static void main() {

        Scanner input=new Scanner(System.in);

                int num1, num2, num3;

                        System.out.print("Insira um número: ");
                        num1=input.nextInt();

                        System.out.print("Insira outro número: ");
                        num2=input.nextInt();

                        System.out.print("Insira mais um número: ");
                        num3=input.nextInt();

                        if (num1 < num2 && num1 < num3 ){
                            System.out.println("O menor número é " +num1);
                        }

                        if (num2 < num1 && num2 < num3 ) {
                            System.out.print("O menor número é " + num2);
                        }

                        if (num3 < num1 && num3 < num2);{
                            System.out.println("O menor número é " + num3);
        }
    }
}
