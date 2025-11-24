package FichaPratica3;

import java.util.Scanner;

public class Ex8 {

    public static void main() {

        Scanner input=new Scanner(System.in);

        int num;

        System.out.print("Insira um número: ");
        num=input.nextInt();

        int antecessor=num-5;
        int sucessor=num+5;

        while (antecessor<num) {
            System.out.println(antecessor);
            antecessor=antecessor+1;

        }

        num=num+1;

        while (num<=sucessor) {
            System.out.println(num);
            num=num+1;
        }

    }
}
