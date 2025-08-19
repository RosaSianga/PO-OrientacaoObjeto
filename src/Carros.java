public class Carros extends Veiculo{

    protected int numeroDePortas;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Carros(String marca, int numeroDePortas) {
        super(marca);
        this.numeroDePortas = numeroDePortas;
    }
}
