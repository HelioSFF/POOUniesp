package exemploHeranca;

public class Veiculo {
    protected  String marca;

    public Veiculo(String marca){
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
