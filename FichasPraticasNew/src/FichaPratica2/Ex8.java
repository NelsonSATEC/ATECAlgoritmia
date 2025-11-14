package FichaPratica2;

import java.util.Scanner;

public class Ex8 {

    public static void main() {

        Scanner input= new Scanner(System.in);

                double nota1, nota2, nota3, mediaponderada;

                System.out.print("Insira a primeira nota (1-20): ");
                nota1= input.nextDouble();

                System.out.print("Insira a segunda nota (1-20): ");
                nota2= input.nextDouble();

                System.out.print("Insira a terceira nota (1-20): ");
                nota3= input.nextDouble();

                mediaponderada = nota1*0.25+nota2*0.35+nota3*0.40;

                if (mediaponderada>=9.5) {
                    System.out.println("Aprovado");

                } else {
                    System.out.println("Aluno reprovado");
                }
    }
}
