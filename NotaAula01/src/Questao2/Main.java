package Questao2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matematica operation = new Matematica();

        int choice;


        System.out.println("Qual operação gostaria de fazer? (Digite 1. adição  2. subtração  3. multiplicação 4. Divisão  5. Elevar ao quadrado");
        int option = input.nextInt();

        do {
            switch (option) {
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    operation.setNum1(input.nextDouble());
                    System.out.println("Digite o segundo numero: ");
                    operation.setNum2(input.nextDouble());
                    operation.adicao();
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    operation.setNum1(input.nextDouble());
                    System.out.println("Digite o segundo numero: ");
                    operation.setNum2(input.nextDouble());
                    operation.subtracao();
                    break;

                case 3:
                    System.out.println("Digite o primeiro numero: ");
                    operation.setNum1(input.nextDouble());
                    System.out.println("Digite o segundo numero: ");
                    operation.setNum2(input.nextDouble());
                    operation.multiplica();
                    break;

                case 4:
                    System.out.println("Digite o primeiro numero: ");
                    operation.setNum1(input.nextDouble());
                    System.out.println("Digite o segundo numero: ");
                    operation.setNum2(input.nextDouble());
                    operation.divisao();
                    break;

                case 5:
                    System.out.println("Digite o numero: ");
                    operation.setNum1(input.nextDouble());
                    operation.quadrado();
                    break;
                default:

            }
            System.out.println("digite 0 para terminar a calculadora");
            choice = input.nextInt();

        } while (choice != 0);
    }
}
