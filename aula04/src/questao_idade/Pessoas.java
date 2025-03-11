package questao_idade;

public class Pessoas {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String etnia;
    private String estadoCivil;
    private int qtdDeFilhos;


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getQtdDeFilhos() {
        return qtdDeFilhos;
    }

    public void setQtdDeFilhos(int qtdDeFilhos) {
        this.qtdDeFilhos = qtdDeFilhos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void fazAniversario() {
        idade += 1;
    }
}
