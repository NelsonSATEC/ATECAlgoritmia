import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Raio da Circunferência:");
        double raio = input.nextDouble();

        double pi =3.14;

        double area = raio * raio * pi;

        System.out.println( "A área da circunferência é: "+area);








    }
}
