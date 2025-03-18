package exemplo1;

public class Pessoa {
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
}