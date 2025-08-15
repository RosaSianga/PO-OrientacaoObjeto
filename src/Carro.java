public class Carro {

    public String descricao;
    public String marca;
    public String modelo;
    public int ano;

    public void mostrarInformacoes() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("-------------------------------------");

    }

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}
