package exemplo1;

import exemplo1.Pessoa;

public class Professor extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario(){
        salario = 300*10;
    }
}
