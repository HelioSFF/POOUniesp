package Exemplo01;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected double altura;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }



    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void aniversario(){
        idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + ", altura=" + altura + '}';
    }

    public abstract void QuemSouEu();


    public abstract void responsabilidade();
}