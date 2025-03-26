package Questao2;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral geraldo = new ClinicoGeral(true,false);
        Cirurgiao sebastiao = new Cirurgiao(true);
        ClinicoGeral marcia = new ClinicoGeral(true,true);

        sebastiao.tratarPaciente();
        sebastiao.fazerIncisao();

        System.out.println("Geraldo atende em casa? : "+geraldo.isAtendeEmCasa());
        geraldo.tratarPaciente();

        System.out.println("Marcia atende em casa? : "+marcia.isAtendeEmCasa());
        marcia.receitar();
    }
}
