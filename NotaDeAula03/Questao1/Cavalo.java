package Questao1;

public class Cavalo extends Animal{
    private String raca;

    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public Cavalo(){
    } //contrutor para caso queira usar o scanner

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void fugir(){
        System.out.println("Sinto que estou em perigo! tenho que fugir!");
    }
}
