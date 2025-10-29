import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Comprimento do Retângulo: ");
        double comprimento = input.nextDouble();

        System.out.print("Altura de retângulo: ");
        double altura = input.nextDouble();

        double area = comprimento * altura;
        double perimetro = 2*comprimento + 2*altura;

        System.out.println ( "A área do rectângulo é: "+area);
        System.out.println ("O perímetro do rectângulo é: "+perimetro);

    }

}