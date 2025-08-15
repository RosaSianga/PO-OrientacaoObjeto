import java.util.Scanner;

public class Produto {

    // 1. Atributo
    private String nome;
    private double preco;
    private int estoque;


    // 2. Metódo
    // static = Metódo que não utiliza orientação ao Objeto
    public void adicionarEstoque(int quantidade) {
        estoque = estoque + quantidade;
        System.out.println("Produto adicionado no estoque com sucesso");
    }

    public void realizarVenda (int quantidade) {
        if (quantidade <= estoque) {
            estoque = estoque - quantidade;
            System.out.println("Produto vendido com sucesso");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }

    // 3. Construtor
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // 4. Encapsulamento - Getters e Stters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro ao atualizar o preço");
        }
    }

    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}
