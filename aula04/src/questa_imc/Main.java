package questa_imc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa person = new Pessoa();
        System.out.println("Bem vindo ao programa de IMC!");
        System.out.println("Para calcular precisamos do seu peso e altura");

        System.out.println("Informe seu peso: ");
        person.setPeso(input.nextDouble());

        System.out.println("Informe sua altura: ");
        person.setAltura(input.nextDouble());

        person.IMC();

    }
}
