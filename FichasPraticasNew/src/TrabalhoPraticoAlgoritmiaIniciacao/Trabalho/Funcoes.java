package TrabalhoPraticoAlgoritmiaIniciacao.Trabalho;

import java.util.Scanner;

public class Funcoes {

    /**
     * Função para apresentar a matriz na consola.
     * sem return e param
     */
    public static void apresentarTabuleiro(String[][] matriz) {

        //sempre que aparecer esta linha, serve para dar um espaço na consola.
        System.out.println("");

        //ciclo for para imprimir matriz na consola.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

    /**
     * Função para determinar se uma posição pode ser utilizada pelo Jogador1 e determinação de "X" para marcação de posição.
     * sem param
     * @return dá return da nova matriz após a jogada.
     */
    public static String[][] vezJogador1(String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int posicao = 0;
        boolean espacoVazio = false;

        //ciclo while mantém o jogador na questão de escolha de posição até escolha válida.
        while (!espacoVazio) {
            espacoVazio = true;

            System.out.println("");
            //para o utilizador poder escolher a opção desejada na consola.
            System.out.print("Introduza o número da posição que quer jogar (Jogador 1 [X]): ");
            posicao = input.nextInt();

            //apenas possivel jogar de 1 a 9
            if (posicao < 1 || posicao > 9) {
                System.out.println("");
                System.out.println("Escolha um número válido! ( 1-9 )");
                espacoVazio = false;

            //utilização da função lugar ocupado para determinar se o lugar escolhido já se encontra selecionado previamente.
            } else if (lugarOcupado(matriz, posicao)) {
                espacoVazio = false;
                System.out.println("");
                System.out.println("Lugar ocupado!");
            }
        }

        //determinação do outcome da posição escolhida pelo utilizador.
        switch (posicao) {

            case 1:
                matriz[0][0] = "X";
                break;

            case 2:
                matriz[0][1] = "X";
                break;

            case 3:
                matriz[0][2] = "X";
                break;

            case 4:
                matriz[1][0] = "X";
                break;

            case 5:
                matriz[1][1] = "X";
                break;

            case 6:
                matriz[1][2] = "X";
                break;

            case 7:
                matriz[2][0] = "X";
                break;

            case 8:
                matriz[2][1] = "X";
                break;

            case 9:
                matriz[2][2] = "X";
                break;

            default:
                System.out.println("");
                System.out.println("Escolha um número válido! ( 1-9 )");
                break;

        }
        return matriz;
    }

    /**
     * Função para determinar se uma posição pode ser utilizada pelo Jogador2 e determinação de "O" para marcação de posição.
     * sem param
     * @return dá return da nova matriz após a jogada.
     */
    public static String[][] vezJogador2(String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int posicao = 0;
        boolean espacoVazio = false;

        //mesmo da anterior, mas para jogador2.
        while (!espacoVazio) {
            espacoVazio = true;

            System.out.println("");
            System.out.print("Introduza o número da posição que quer jogar (Jogador 2 [O]): ");
            posicao = input.nextInt();

            if (posicao < 1 || posicao > 9) {
                System.out.println("");
                System.out.println("Escolha um número válido!( 1-9 )");
                espacoVazio = false;

            } else if (lugarOcupado(matriz, posicao)) {
                espacoVazio = false;
                System.out.println("");
                System.out.println("Lugar ocupado!");
            }
        }

        switch (posicao) {

            case 1:
                matriz[0][0] = "O";
                break;

            case 2:
                matriz[0][1] = "O";
                break;

            case 3:
                matriz[0][2] = "O";
                break;

            case 4:
                matriz[1][0] = "O";
                break;

            case 5:
                matriz[1][1] = "O";
                break;

            case 6:
                matriz[1][2] = "O";
                break;

            case 7:
                matriz[2][0] = "O";
                break;

            case 8:
                matriz[2][1] = "O";
                break;

            case 9:
                matriz[2][2] = "O";
                break;

            default:
                System.out.println("");
                System.out.println("Escolha um número válido! ( 1-9 )");
                break;

        }
        return matriz;
    }


    /**
     * Função para determinar se uma posição está ocupada. A ser utilizada nas funções de vez de jogador 1 e jogador 2.
     * @param posicao a ser analisado.
     * @return true se a posição está ocupada, false se permitido jogar.
     */
    public static boolean lugarOcupado(String[][] matriz, int posicao) {
//determina as condições para um número estar coupado ou não, sendo que qualquer coisa diferente do número original da primeira matriz vai entregar verdadeiro e não será possivel continua.r
        switch (posicao) {

            case 1:
                if (!matriz[0][0].equals("1")) {
                    return true;
                }
                break;

            case 2:
                if (!matriz[0][1].equals("2")) {
                    return true;
                }
                break;

            case 3:
                if (!matriz[0][2].equals("3")) {
                    return true;
                }
                break;

            case 4:
                if (!matriz[1][0].equals("4")) {
                    return true;
                }
                break;

            case 5:
                if (!matriz[1][1].equals("5")) {
                    return true;
                }
                break;

            case 6:
                if (!matriz[1][2].equals("6")) {
                    return true;
                }
                break;

            case 7:
                if (!matriz[2][0].equals("7")) {
                    return true;
                }
                break;

            case 8:
                if (!matriz[2][1].equals("8")) {
                    return true;
                }
                break;

            case 9:
                if (!matriz[2][2].equals("9")) {
                    return true;
                }
                break;

        }
        return false;
    }

    /**
     * Função para fixar a matriz resultante da última jogada na matriz de jogo.
     * sem param
     * @return dá return da matriz
     */
    public static String[][] escreverJogada(String[][] matriz) {

        int contador = 1;;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                //converte o número para string e fixa na posição.
                matriz[i][j] = String.valueOf(contador);
                contador++;
            }
        }
        return matriz;

    }

    /**
     * Função para avaliar condições de vitória para Jogador1.
     * sem param
     * @return para vencedor.
     */
    public static boolean vitoriaJogador1(String[][] matriz) {

        boolean vencedor = false;

        //são determinados todos os casos em que o jogador 1 poderia vencer
        if (matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) {

            vencedor = true;

        }

        if (matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) {

            vencedor = true;

        }

        if (matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X")) {

            vencedor = true;

        }

        if (matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X")) {

            vencedor = true;

        }

        if (matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X")) {

            vencedor = true;

        }

        if (matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X")) {

            vencedor = true;

        }

        if (matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X")) {

            vencedor = true;

        }

        if (matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X")) {

            vencedor = true;

        }

        return vencedor;
    }

    /**
     * Função para avaliar condições de vitória para Jogador2.
     * sem param
     * @return para vencedor.
     */
    public static boolean vitoriaJogador2(String[][] matriz) {

        boolean vencedor = false;

        //mesmo que anterior para jogador 2
        if (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O")) {

            vencedor = true;

        }

        if (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O")) {

            vencedor = true;

        }

        if (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O")) {

            vencedor = true;

        }

        if (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O")) {

            vencedor = true;

        }

        if (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O")) {

            vencedor = true;

        }

        if (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O")) {

            vencedor = true;

        }

        if (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O")) {

            vencedor = true;

        }

        if (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O")) {

            vencedor = true;

        }

        return vencedor;
    }
}
