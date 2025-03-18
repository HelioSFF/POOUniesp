package exemploHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Carro car = new Carro("QWID",4);
        Moto mc = new Moto();
        Barco ship = new Barco();

        int option = input.nextInt();

        do {
            switch (option) {
                case 1:
                    System.out.println("Carro");
                    break;

                case 2:
                    System.out.println("Moto");
                    break;

                case 3:
                    System.out.println("Barco");
                    break;

                default:

            }option= input.nextInt();

        }while (option != 0) ;
    }
}