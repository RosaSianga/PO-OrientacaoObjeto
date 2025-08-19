public class Bicicleta extends Veiculo{

    protected int numeroDeMarchas;

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public Bicicleta(String marca, int numeroDeMarchas) {
        super(marca);
        this.numeroDeMarchas = numeroDeMarchas;
    }
}
