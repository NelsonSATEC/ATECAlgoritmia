package FichaPratica4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num1, num2;
        String operacao, continuar;

        System.out.print("Insira um número: ");
        num1= input.nextInt();

        System.out.print("Insira outro número: ");
        num2= input.nextInt();

        do {
            System.out.println("A - Soma");
            System.out.println("B - Subtração");
            System.out.println("C - Multiplicação");
            System.out.println("D - Divisão");

            System.out.println("Escolha a operação aritmética, selecionando o sinal da operação pretendida ( + - * /) : ");
            operacao= input.next();

            switch (operacao) {

                case "+": System.out.println(num1+num2);
                    break;
                case "-": System.out.println(num1-num2);
                    break;
                case "*" : System.out.println(num1*num2);
                    break;
                case "/" : System.out.println(num1/num2);
                    break;
                default: System.out.println("Opção Inválida! Insira a opção correta.");
            }

            System.out.print("Deseja continuar? (Para sair prima n) : ");
            continuar= input.next();

        } while (continuar!="n");


        }



    }
