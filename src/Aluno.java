public class Aluno {

    public String nome;
    public double nota;

    public void verificarStatus(String nome, double nota) {

        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);

        if (nota >= 7) {
            System.out.println(nome + " foi APROVADO(A)");
        } else {
            System.out.println(nome + " foi REPROVADO(A)");
        }

        System.out.println("-----------------------------");
    }
}
