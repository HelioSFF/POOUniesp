package Questao2;

public class Cirurgiao extends Medico{
    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    public void fazerIncisao(){
        System.out.println("Fazendo Incisão...");
    }
}
