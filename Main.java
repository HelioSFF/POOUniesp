import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno student = new Aluno();
        System.out.println("Bem vindo ao progrma para calcular media!");
        System.out.println("Digite sua primeira nota: ");
        student.setNota1(input.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        student.setNota2(input.nextDouble());

        System.out.println("Digite sua terceira nota: ");
        student.setNota3(input.nextDouble());

        student.media();

    }
}
