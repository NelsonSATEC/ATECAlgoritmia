package FichasPratica01;

import java.util.Scanner;

public class Ex8Solo {

    public static void main() {

        Scanner input = new Scanner(System.in);

        int sm1, mm1, sm2, mm2, sm3, mm3, sm4, mm4, sm5, mm5, totalSegundos, resto1, resto2, hh, mm, ss;

        System.out.print("Insira os minutos da música 1:");
        mm1 = input.nextInt();

        System.out.print("Insira os segundos da música 1:");
        sm1 = input.nextInt();

        System.out.print("Insira os minutos da música 2:");
        mm2 = input.nextInt();

        System.out.print("Insira os segundos da música 2:");
        sm2 = input.nextInt();

        System.out.print("Insira os minutos da música 3:");
        mm3 = input.nextInt();

        System.out.print("Insira os segundos da música 3:");
        sm3 = input.nextInt();

        System.out.print("Insira os minutos da música 4:");
        mm4 = input.nextInt();

        System.out.print("Insira os segundos da música 4:");
        sm4 = input.nextInt();

        System.out.print("Insira os minutos da música 5:");
        mm5 = input.nextInt();

        System.out.print("Insira os segundos da música 5:");
        sm5 = input.nextInt();

        totalSegundos = sm1 + sm2 + sm3 + sm4 + sm5 + 60 * (mm1 + mm2 + mm3 + mm4 + mm5);

        hh = totalSegundos / 3600;
        resto1 = totalSegundos % 3600;
        mm = resto1 / 60;
        resto2 = resto1 % 60;
        ss = resto2;

        System.out.println("A duração do albúm em horas é:" + hh);
        System.out.println("A duração do albúm em minutos é:" + mm);
        System.out.println("A duração do albúm em segundos é:" + ss);


    }
}