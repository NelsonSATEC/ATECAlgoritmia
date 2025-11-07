package FichaPratica2;

import java.util.Scanner;

public class Ex1 {

    public static void main() {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um número:");
        num1= input.nextInt();

        System.out.print("Insira outro número:");
        num2= input.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é:" + num1);
        } else {
            System.out.println("O maior número é:" + num2);
        }


        }
    }
