package questao_idade;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite nome: ");
        Pessoas person = new Pessoas();
        person.setNome(input.nextLine());

        System.out.println("Digite idade: ");
        person.setIdade(input.nextInt());

        System.out.println("A pessoa é aniversariante? /n Digite S para Sim e N para não");
        String aniversariante = input.next();


        System.out.println("Digite altura: ");
        person.setAltura(input.nextDouble());

        System.out.println("Digite peso: ");
        person.setPeso(input.nextDouble());

        System.out.println("Digite sua Etnia: ");
        person.setEtnia(input.next());

        System.out.println("Digite estado civil: ");
        person.setEstadoCivil(input.next());

        System.out.println("Digite quantos filhos: ");
        person.setQtdDeFilhos(input.nextInt());




        System.out.println("Ficha: ");
        System.out.println("Nome: "+person.getNome());
        System.out.println("Idade: "+person.getIdade());
        if (aniversariante.equalsIgnoreCase("s")){
            person.fazAniversario();
            System.out.println("Feliz Aniversario");
        }
        System.out.println("Altura: "+person.getAltura());
        System.out.println("Peso: "+person.getPeso());
        System.out.println("Etnia: "+person.getEtnia());
        System.out.println("Estado Civil: "+person.getEstadoCivil());
        System.out.println("Quantos filhos: "+person.getQtdDeFilhos());


    }
}