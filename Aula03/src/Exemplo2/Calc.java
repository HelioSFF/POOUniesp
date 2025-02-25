package Exemplo2;

public class Calc {

    double a ;
    double b ;
    double total;
    public double soma(){
        return a+b ;
    }

    public double sub(){
        return a-b;
    }

    public double mult(){
        return a*b;
    }

    public double div(){
        return a/b;
    }

    public void square(double n1){
        total = n1*n1;
        System.out.println("Quadrado do numero: "+ total);
    }
}
