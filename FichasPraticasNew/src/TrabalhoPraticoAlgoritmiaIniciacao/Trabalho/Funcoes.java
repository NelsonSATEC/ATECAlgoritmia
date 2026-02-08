package TrabalhoPraticoAlgoritmiaIniciacao.Trabalho;

import java.util.Scanner;

public class Funcoes {

    public static boolean lugarOcupado(String[][] matriz, int posicao) {

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

    public static void apresentarTabuleiro(String[][] matriz) {

        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static String[][] vezJogador1(String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int posicao = 0;
        boolean espacoVazio = false;

        while (!espacoVazio) {
            espacoVazio = true;

            System.out.println("");
            System.out.print("Introduza o número da posição que quer jogar (Jogador 1 [X]): ");
            posicao = input.nextInt();
            if (posicao < 1 || posicao > 9) {
                System.out.println("");
                System.out.println("Escolha um número válido! ( 1-9 )");
                espacoVazio = false;
            } else if (lugarOcupado(matriz, posicao)) {
                espacoVazio = false;
                System.out.println("");
                System.out.println("Lugar ocupado!");
            }
        }

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

    public static String[][] vezJogador2(String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int posicao = 0;
        boolean espacoVazio = false;

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

    public static String[][] escreverJogada(String[][] matriz) {

        Integer contador = 1;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = contador.toString();
                contador++;
            }
        }
        return matriz;

    }

    public static boolean vitoriaJogador1(String[][] matriz) {

        boolean vencedor = false;

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

    public static boolean vitoriaJogador2(String[][] matriz) {

        boolean vencedor = false;

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
