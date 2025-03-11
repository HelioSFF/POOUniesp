package questa_imc;

public class Pessoa {
    private double peso;

    private double altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void IMC(){
       double imc = peso/(altura*altura);
        System.out.println("O IMC é igual a "+imc);
    }

}
