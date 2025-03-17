package Questao4;

import java.util.Objects;

public class Banco {

    private double saldo = 0;
    private String conta;

    public String getConta(){
        return conta;
    }
    public void setConta(String conta){
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        double sal = getSaldo();
        System.out.println("Saldo: "+ sal);
    }

    public void depositar(double saldo){
        this.saldo = this.saldo + saldo;
    }

    public void sacar(double saque){
        if (saque > this.saldo){
            System.out.println("Saldo insuficiente");
        } else{
            this.saldo = this.saldo - saque;
        }
    }

    public void transferir(String conta, double trans) {
        if (!Objects.equals(this.conta, conta)) {
            if (trans > this.saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                this.saldo = this.saldo - trans;
                System.out.println("Transferencia da conta " + this.conta + " para a conta " + conta + " no valor de " + trans + "R$, foi realizada com sucesso!");
            }
        }else{
            System.out.println("Não é possivel transferir para mesma conta!");
        }
    }
}
