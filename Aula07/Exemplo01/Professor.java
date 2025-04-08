package Exemplo01;

public final class Professor extends Pessoa implements Remunaravel {
    private double salario;
    public CARGO cargo;


    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public Professor(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Professor{" + "salario=" + salario + ", nome='" + nome + '\'' + ", idade=" + idade + ", altura=" + altura + "} " + super.toString();
    }

    @Override
    public void QuemSouEu(){
        System.out.println("Sou o professor");
    }

    @Override
    public void responsabilidade(){
        System.out.println("Eu ministro a aula");
    }

    public void setCargo(CARGO cargo){
        this.cargo = cargo;
    }

    public CARGO getCargo(){
        return cargo;
    }

    @Override
    public void calcularSalario(){
        System.out.println(salario);
    }

    @Override
    public void aplicarBonus(){
        System.out.println(salario+ (salario*0.3));
    }
}