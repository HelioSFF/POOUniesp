package exemplo1;

import exemplo1.Aluno;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite nome: ");
        Aluno a = new Aluno("Helio",30,7,8,9,8.5);
        Aluno a1 = new Aluno();


        System.out.println("Digite idade: ");
        a1.setIdade(input.nextInt());

        System.out.println("A pessoa é aniversariante? /n Digite S para Sim e N para não");
        String aniversariante = input.next();


        System.out.println("Digite altura: ");
        a1.setAltura(input.nextDouble());

        String pnome = a1.getNome();
        int pidade = a1.getIdade();
        double paltura = a1.getAltura();


        System.out.println("Ficha: ");
        System.out.println("Nome: "+pnome);
        System.out.println("Idade: "+pidade);
        if (aniversariante.equalsIgnoreCase("s")){
            a1.aniversario();
            System.out.println("Feliz Aniversario");
        }
        System.out.println("Altura: "+paltura);


    }
}