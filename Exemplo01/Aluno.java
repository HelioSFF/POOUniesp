package Exemplo01;


public final class Aluno extends Pessoa {
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    public CARGO cargo;

    public Aluno(){

    }
    public Aluno(String nome ,int idade, double nota1,double nota2,double nota3,double media){
        super(nome,idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", media=" + media + ", nome='" + nome + '\'' + ", idade=" + idade + ", altura=" + altura + "} " + super.toString();
    }

    @Override
    public void QuemSouEu(){
        System.out.println("Sou o aluno");
    }

    @Override
    public void responsabilidade(){
        System.out.println("Eu estudo");
    }


    public void setCargo(CARGO cargo){
        this.cargo = cargo;
    }

    public CARGO getCargo() {
        return cargo;
    }
}