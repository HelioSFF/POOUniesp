package Exemplo01;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Professor teacher =  new Professor("Fernanda",40,15000);
        Coordenador coordenador = new Coordenador();

        Disciplina poo = new Disciplina();


        System.out.println("Digite nome da disciplina");
        poo.setNome(input.nextLine());

        System.out.println("Digite nome: ");
        aluno1.setNome(input.nextLine());


        System.out.println("Digite idade: ");
        aluno1.setIdade(input.nextInt());

        System.out.println("A pessoa é aniversariante? /n Digite S para Sim e N para não");
        String aniversariante = input.next();


        System.out.println("Digite altura: ");
        aluno1.setAltura(input.nextDouble());

        System.out.println(aluno1); // a.ToString;

        if (aniversariante.equalsIgnoreCase("s")){
            aluno1.aniversario();
            System.out.println("Feliz Aniversario");
        }


        poo.cadastrarAluno(aluno1);

        poo.ministrarDisciplina(teacher);


        System.out.println(poo);

        aluno1.QuemSouEu();
        aluno1.responsabilidade();


        teacher.QuemSouEu();
        teacher.responsabilidade();

        coordenador.QuemSouEu();
        coordenador.responsabilidade();


        teacher.setCargo(CARGO.Professor);
        System.out.println(teacher.getCargo());

        teacher.aplicarBonus();
        teacher.calcularSalario();




    }
}