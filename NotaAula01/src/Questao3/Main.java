package Questao3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("Nome do produto");
        prod.setName(input.nextLine());
        System.out.println("Preço");
        prod.setPrice(input.nextDouble());
        System.out.println("Estoque");
        prod.setAmount(input.nextInt());

        System.out.println("Digite 1 para adicionar estoque, 2 para vender produto e 3 para exibir estoque");
        int option = input.nextInt();
        int choice;

        do {
            switch (option) {
                case 1:
                    System.out.println("Digite numero que deseja aumentar no estoque: ");
                    int addnew = input.nextInt();
                    prod.addStock(addnew);
                    break;
                case 2:
                    System.out.println("Digite quantas unidades gostaria de vender: ");
                    int venda = input.nextInt();
                    prod.sell(venda);

                    break;

                case 3:
                    System.out.println("Exibindo estoque: ");
                    prod.showStock();
                    break;

                default:

            }
            System.out.println("digite 0 para terminar o programa");
            choice = input.nextInt();
            System.out.println("Digite 1 para adicionar estoque, 2 para vender produto e 3 para exibir estoque");
            option = input.nextInt();

        } while (choice != 0);
    }
}
