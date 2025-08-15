public class PersonagemJogo {

    private String nome;
    private int nivel;
    private int pontoDeVida;


    public void receberDano (int dano) {
        if (dano > pontoDeVida){
            pontoDeVida = 0;
        } else {
            pontoDeVida = pontoDeVida - dano;
        }
    }

    public void subirDeNivel(){
        nivel = nivel + 1;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Ponto de Vida: " + pontoDeVida);
        System.out.println("-------------------------------");
    }

    public PersonagemJogo(String nome, int nivel, int pontoDeVida){
        this.nome = nome;
        this.nivel = nivel;
        this.pontoDeVida = pontoDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontoDeVida() {
        return pontoDeVida;
    }
}

