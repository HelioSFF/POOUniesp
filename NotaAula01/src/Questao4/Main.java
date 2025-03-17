package Questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco bc = new Banco();


        System.out.println("Bem vindo ao seu banco!");
        System.out.println("Digite sua conta!");
        bc.setConta(input.next());
        System.out.println("Informe qual procedimento gostaria de realizar");
        System.out.println("Tecle (1 para Consultar saldo / 2 para Depositar / 3 para Sacar / 4 para fazer uma transferencia)");
        int option = input.nextInt();

        do {
            switch (option) {
                case 1:
                    bc.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor em reais do deposito");
                    bc.depositar(input.nextDouble());
                    System.out.println("Deposito feito com sucesso");
                    break;

                case 3:
                    System.out.println("Digite o valor em reais do saque");
                    bc.sacar(input.nextDouble());
                    break;

                case 4:
                    System.out.println("Digite a conta e o valor em reais da transferencia");
                    bc.transferir(input.next(), input.nextDouble());
                    break;


                default:

            }
            System.out.println("Tecle (1 para Consultar saldo / 2 para Depositar / 3 para Sacar / 4 para fazer uma transferencia)");
            System.out.println(" ou digite 0 para terminar o programa");
            option = input.nextInt();

        } while (option != 0);
    }
    }
