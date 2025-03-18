package exemploHeranca;

public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro(String marca, int qtdPortas){
        super(marca);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}
