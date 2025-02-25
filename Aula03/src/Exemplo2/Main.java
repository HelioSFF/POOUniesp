package Exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc operation = new Calc();
        int choice;


        System.out.println("Qual operação gostaria de fazer? (Digite 1. adição  2. subtração  3. multiplicação 4. Divisão  5. Elevar ao quadrado");
        int option = input.nextInt();

        do {
            switch (option) {
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    operation.a = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    operation.b = input.nextDouble();
                    System.out.println(operation.soma());
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    operation.a = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    operation.b = input.nextDouble();
                    System.out.println(operation.sub());
                    break;

                case 3:
                    System.out.println("Digite o primeiro numero: ");
                    operation.a = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    operation.b = input.nextDouble();
                    System.out.println(operation.mult());
                    break;

                case 4:
                    System.out.println("Digite o primeiro numero: ");
                    operation.a = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    operation.b = input.nextDouble();
                    System.out.println(operation.div());
                    break;

                case 5:
                    System.out.println("Digite o numero: ");
                    operation.square(input.nextDouble());
                    break;
                default:

            }
            System.out.println("digite 0 para terminar a calculadora");
            choice = input.nextInt();

        } while (choice != 0);


    }
}
