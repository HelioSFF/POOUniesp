package Questao1;

public class Leao extends Animal{
    private boolean juba;

    public Leao(float tamanho, String cor, boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public Leao(){
    }  //contrutor para caso queira usar o scanner

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar(){
        System.out.println("Vejo presa, vou pegar!");
    }
}
