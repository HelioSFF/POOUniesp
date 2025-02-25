import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite nome: ");
        Pessoa person = new Pessoa();
        person.nome = input.next();

        System.out.println("Digite idade: ");
        person.idade = input.nextInt();

        System.out.println("A pessoa é aniversariante? /n Digite S para Sim e N para não");
        String aniversariante = input.next();


        System.out.println("Digite altura: ");
        person.altura = input.nextDouble();


        System.out.println("Ficha: ");
        System.out.println("Nome: "+person.nome);
        System.out.println("Idade: "+person.idade);
        if (aniversariante.equalsIgnoreCase("s")){
            person.fazAniversario();
            System.out.println("Feliz Aniversario");
        }
        System.out.println("Altura: "+person.altura);


        }
}
