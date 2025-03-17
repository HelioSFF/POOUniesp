public class Produto {
    private int codigo;
    private String nome;
    private double peso;
    private String cor;
    private double valor;
    private int qtd;
    private int qtdvenda;

    public int getQtdvenda() {
        return qtdvenda;
    }

    public void setQtdvenda(int qtdvenda) {
        this.qtdvenda = qtdvenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void venda(int option){
        switch (option){
            case 1:
                System.out.println("Pagamento com Pix");
                double valorVenda = this.valor * this.qtdvenda;
                double valorFinal = valorVenda - (valorVenda - valorVenda*0.05);
                System.out.println(STR."Valor total da compra : \{valorFinal} R$");

            case 2:
                System.out.println("Pagamento em Espécie");
                valorVenda = this.valor * this.qtdvenda;
                valorFinal = valorVenda - (valorVenda - valorVenda*0.05);
                System.out.println(STR."Valor total da compra : \{valorFinal} R$");

            case 3:
                System.out.println("Transferência bancaria ");
                valorVenda = this.valor * this.qtdvenda;
                valorFinal = valorVenda - (valorVenda - valorVenda*0.05);
                System.out.println(STR."Valor total da compra : \{valorFinal} R$");


            case 4:
                System.out.println("Pagamento no Débito");
                valorVenda = this.valor * this.qtdvenda;
                valorFinal = valorVenda - (valorVenda - valorVenda*0.05);
                System.out.println(STR."Valor total da compra : \{valorFinal} R$");

            case 5:
                System.out.println("Pagamento no Crédito");
                valorVenda = this.valor * this.qtdvenda;
                System.out.println(STR."Valor total da compra : \{valorVenda} R$");
        }
    }

    public void consultarEstoque(){
        int consulta = getQtd();
        System.out.println(STR."Estoque: \{consulta}");
    }
}
