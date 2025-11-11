package FichaPratica2;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String opcao;

        System.out.println("_____ MENU _____");
        System.out.println("1.Criar");
        System.out.println("2.Atualizar");
        System.out.println("3.Eliminar");
        System.out.println("4.Sair");
        System.out.print("Escolha um opção: ");

        opcao = input.next();

        switch (opcao) {

            case "1":
                System.out.println("Criado");
                break;

            case "2":
                System.out.println("Atualizado");
                break;

            case "3":
                System.out.println("Eliminado");
                break;

            case "4":
                System.out.println("");
                break;

            default:
                System.out.println("Operação não reconhecida.");
                break;


        }
    }
}
