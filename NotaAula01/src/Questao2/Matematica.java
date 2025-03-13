package Questao2;

public class Matematica {
    private double num1, num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void adicao(){
        double add = num1 + num2;
        System.out.println("Adição = "+add);
    }

    public void subtracao(){
        double sub = num1 - num2;
        System.out.println("Substração = "+sub);
    }

    public void multiplica(){
        double mult = num1 * num2;
        System.out.println("Multiplicação = "+mult);
    }

    public void divisao(){
        double div = num1 / num2;
        System.out.println("Divisão = "+div);
    }

    public void quadrado(){
        double square = num1*num1;
        System.out.println(square);
    }
}
