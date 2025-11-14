package FichaPratica2;

import java.util.Scanner;

public class Ex15 {

    public static void main() {

        Scanner input= new Scanner(System.in);

        int num1, num2, num3;
        String ordem;

        System.out.print("Insira o 1º número: ");
        num1 = input.nextInt();

        System.out.print("Insira o 2º número: ");
        num2 = input.nextInt();

        System.out.print("Insira o 3º número: ");
        num3 = input.nextInt();

        System.out.print("Ordem pretendida (A ou B):");
        ordem = input.next();

        switch (ordem) {

            case "A":
                if (num1 < num2 && num2 < num3) {
                    System.out.println(num1 +":" +num2 +":" +num3);
                }

                if (num1 < num3 && num3 < num2) {
                    System.out.println(num1 +":" +num3 +":" +num2);
                }

                if (num2 < num1 && num1 < num3) {
                    System.out.println(num2 +":" +num1 +":" +num3);
                }

                if (num2 < num3 && num3 < num1) {
                    System.out.println(num2 +":" +num3 +":" +num1);
                }

                if (num3 < num1 && num1 < num2) {
                    System.out.println(num3 +":" +num1 +":" +num2);
                }

                if (num3 < num2 && num2 < num1) {
                    System.out.println(num3 + ":" + num2 + ":" + num1);
                }
                break;

            case "B":
                if (num3 < num2 && num2 < num1) {
                    System.out.println(num1 +":" +num2 +":" +num3);
                }

                if (num2 < num3 && num3 < num1) {
                    System.out.println(num1 +":" +num3 +":" +num2);
                }

                if (num3 < num1 && num1 < num2) {
                    System.out.println(num2 +":" +num1 +":" +num3);
                }

                if (num1 < num3 && num3 < num2) {
                    System.out.println(num2 +":" +num3 +":" +num1);
                }

                if (num2 < num1 && num1 < num3) {
                    System.out.println(num3 +":" +num1 +":" +num2);
                }

                if (num1 < num2 && num2 < num3) {
                    System.out.println(num3 + ":" + num2 + ":" + num1);
                }
                break;

            default:
                System.out.println("Operação não reconhecida:" +ordem);
                break;










        }




    }
}
