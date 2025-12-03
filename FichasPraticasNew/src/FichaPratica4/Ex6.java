package FichaPratica4;

import java.util.Scanner;

public class Ex6 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num1, num2, contador=0;

        System.out.print("Jogador1, insira um número: ");
        num1= input.nextInt();

        do {
            System.out.print("Jogador 2, tente adivinhar o número: ");
            num2= input.nextInt();

            contador++;

            if (num2<num1) {
                System.out.println("O número é maior que o que escolheste!");
            } else if (num2>num1){
                System.out.println("O número é maior que o que escolheste!");
            }

        } while (num2!=num1);

        System.out.println("Parabéns acertaste, precisaste de " +contador +" tentativas.");

    }
}
