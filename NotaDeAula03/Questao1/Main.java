package Questao1;

public class Main {
    public static void main(String[] args) {
        Leao leo = new Leao(120,"marron",true);
        Cavalo horse = new Cavalo(160,"branco","Arabian");


        horse.comer("Feno");
        leo.cacar();
        horse.fugir();
        leo.comer("Cavalo");
    }
}