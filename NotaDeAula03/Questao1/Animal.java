package Questao1;

public class Animal {
    protected float tamanho;
    protected String cor;

    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public Animal() {
    } //contrutor para caso queira usar o scanner

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer(String comida){
        System.out.println("Que gostoso(a).."+comida+"!");
    }
}
