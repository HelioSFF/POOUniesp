package Exemplo01;

public final class Coordenador extends Pessoa implements Remunaravel{
    public CARGO cargo;
    private double salario;

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public void QuemSouEu(){
        System.out.println("Sou o coordenador");
    }

    @Override
    public void responsabilidade(){
        System.out.println("Eu coordeno");
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
        System.out.println(salario+ (salario*0.5));
    }
}
