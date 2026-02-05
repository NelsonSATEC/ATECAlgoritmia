package FichaPratica6;

public class Ex5 {

    public static int imprimirTabuada(int numero) {

        int resultado=0;

        System.out.println("Tabuada do "+numero +": ");

        for (int i = 1; i <= 10; i++) {
            resultado=numero*i;
            System.out.println(numero + "x" +i +"+" +"=" +(resultado));

        }
        return resultado;
    }
}
