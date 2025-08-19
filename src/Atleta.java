public class Atleta extends Pessoa{
    private String esporte;

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public Atleta(String nome, String esporte) {
        super(nome);
        this.esporte = esporte;
    }

}
