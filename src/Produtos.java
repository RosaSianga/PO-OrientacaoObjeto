public class Produtos {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0){
            this.preco = preco;
        } else {
            System.out.println("Não é permitido um preço menor que zero");
        }

    }

    public Produtos (String nome){
        this.nome = nome;
        this.preco = 0.0;
    }


    
}
