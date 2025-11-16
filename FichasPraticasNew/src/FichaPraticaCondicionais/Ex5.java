package FichaPraticaCondicionais;

import java.util.Scanner;

public class Ex5 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int numerocerto, tentativa1, tentativa2;
        
        numerocerto=31;

        System.out.println("Adivinhe o número de 0 a 100: ");
        tentativa1= input.nextInt();
        
        if (tentativa1==31) {
            System.out.println("Acertou!");
        }else if (tentativa1<31){
            System.out.println("O número é muito baixo, tem mais uma tentativa");
        } else if (tentativa1>31) {
            System.out.println("O número é muito alto, tem mais uma tentativa");
        }
        tentativa2= input.nextInt();

        if (tentativa2==31) {
            System.out.println("Acertou!");
        } else if (tentativa2!=31) {
            System.out.println("Falhou, acabaram as tentativas.");
        }


    }
}
