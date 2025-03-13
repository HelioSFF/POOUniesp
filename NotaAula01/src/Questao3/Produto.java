package Questao3;

public class Produto {
    private String name;
    private double price;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addStock(int add){
        this.amount = amount + add;
        int amountget = getAmount();
        System.out.println("Stock: "+amountget);
    }

    public void sell(int qtd){
        int venda = this.amount - qtd;
        double valor = this.price * qtd;
        setAmount(venda);
        System.out.println("Total da venda: "+valor);

    }

    public void showStock(){
        int show = getAmount();
        System.out.println(show);
    }



}
