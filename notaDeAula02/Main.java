import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.println("Registro de produto!");

        System.out.println("Digite codigo do produto!");
        prod.setCodigo(input.nextInt());

        System.out.println("Digite o nome do produto");
        prod.setNome(input.next());

        System.out.println("Digite peso do produto em kilos");
        prod.setPeso(input.nextDouble());

        System.out.println("Digite a cor do produto");
        prod.setCor(input.next());

        System.out.println("Digite valor do produto");
        prod.setValor(input.nextDouble());

        System.out.println("Digite a quantidade no estoque");
        prod.setQtd(input.nextInt());

        System.out.println("Produto: ");
        System.out.println(prod.getCodigo()+" - "+prod.getNome()+ ", "+prod.getPeso()+"KG "+prod.getCor()+", "+prod.getValor()+" R$");


        System.out.println("Informe qual procedimento gostaria de realizar");
        System.out.println("Tecle (1 para Vender produto / 2 para Consultar estoque / 3 para adicionar ao estoque )");
        int option = input.nextInt();

        do {
            switch (option) {
                case 1:
                    System.out.println("Informe metodo de pagamento");
                    System.out.println("1 - Pix ,Transferência ou Débito / 2 - Crédito / 3- Espécie ");
                    int pagamento = input.nextInt();

                    if (pagamento == 3) {
                        System.out.println("Digite a quantidade que deseja vender");
                        double venda = prod.vendaComDesconto(input.nextInt());
                        System.out.println("Informe quantia de dinheiro em reais");
                        prod.setEspecie(input.nextDouble());
                        prod.troco(prod.getEspecie(), venda);
                        break;

                    } else if (pagamento == 2) {
                        System.out.println("Digite a quantidade que deseja vender e depois aperte (enter) e quantidade de parcelas (digite 1 para a vista)");
                        System.out.println("Total da venda: "+prod.vendaParcelada(input.nextInt(), input.nextInt())+" R$");
                        break;

                    } else if (pagamento == 1) {
                        System.out.println("Digite a quantidade que deseja vender");
                        System.out.println("Total da venda: "+prod.vendaComDesconto(input.nextInt())+" R$");
                        break;
                    } else{
                        System.out.println("Opção invalida!");
                        break;
                    }
                case 2:
                    System.out.println("Quantidade no estoque : "+prod.getQtd());
                    break;

                case 3:
                    System.out.println("Digite a quantidade a ser adicionada no estoque");
                    prod.adicionarEstoque(input.nextInt());



                default:

            }
            System.out.println("Tecle (1 para Vender produto / 2 para Consultar estoque / 3 adicionar ao estoque )");
            System.out.println(" ou digite 0 para terminar o programa");
            option = input.nextInt();

        } while (option != 0);
    }
}
