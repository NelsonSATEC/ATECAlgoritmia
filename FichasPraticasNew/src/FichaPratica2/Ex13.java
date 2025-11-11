package FichaPratica2;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.print("Insira as horas em formato 24h:");
        horas = input.nextInt();

        System.out.print("Insira os minutos:");
        minutos = input.nextInt();

        if (horas >= 12) {
            System.out.println(+horas - 12+":" + minutos + "PM");
        }

        if (horas <12){
            System.out.println(+horas +":" +minutos + "AM");
        }


    }
}
