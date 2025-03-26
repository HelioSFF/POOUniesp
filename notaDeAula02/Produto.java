public class Produto {
    private int codigo, qtd;
    private String nome, cor;
    private double valor, peso, especie;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEspecie(double especie){
        this.especie = especie;
    }

    public double getEspecie(){
        return especie;
    }

    public double vendaComDesconto(int qtd) {
        this.qtd = this.qtd - qtd;
        double venda = qtd * this.valor;
        venda = venda - venda * 0.05;
        return venda;
    }

    public void troco(double especie, double venda){
        double troco = especie - venda;
        if (venda > especie){
            System.out.println("Quantia de dinheiro insuficiente");
        } else {
            System.out.println("Total da venda: "+venda+" R$");
            System.out.println("Troco: "+troco+" R$");
        }
    }

    public double vendaParcelada(int qtd, int parcela) {
        this.qtd = this.qtd - qtd;
        double totalVenda = qtd * this.valor;
        return totalVenda/parcela;
    }

    public void adicionarEstoque(int qtd){
        this.qtd = this.qtd + qtd;
    }

}
