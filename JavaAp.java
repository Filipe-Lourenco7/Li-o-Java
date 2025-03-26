package javaapp;
public class JavaAp {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000, 10, "Eletrônico", 10);
        produto.exibirInfo();
    }
}
class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;
    private double desconto;

    public Produto(String p_nome, double p_preco, int p_quantidade, String p_categoria, double p_desconto) {
        this.nome = p_nome;
        this.preco = p_preco;
        this.quantidade = p_quantidade;
        this.categoria = p_categoria;
        this.desconto = p_desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String p_nome) {
        this.nome = p_nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double p_preco) {
        this.preco = p_preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int p_quantidade) {
        this.quantidade = p_quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String p_categoria) {
        this.categoria = p_categoria;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double p_desconto) {
        this.desconto = p_desconto;
    }
    
    public double calcularPrecoFinal() {
        return preco - (preco * (desconto / 100));
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço Original: R$" + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço Final: R$" + calcularPrecoFinal());
    }
}
