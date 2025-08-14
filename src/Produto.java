import java.util.Scanner;

public class Produto {

    // 1. Atributo
    public String nome;
    public double preco;
    public int estoque;


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
}
