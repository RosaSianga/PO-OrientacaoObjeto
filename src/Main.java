public class Main {
    public static void main(String[] args) {

//  1. Criando a Classe Musica (Apenas Atributos)

        Musica musica = new Musica();
        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queen";
        musica.duracaoEmSegundos = 355;

        System.out.println("Tocando agora: " + musica.titulo);
        System.out.println("Artista: " + musica.artista);

//  2. Criando a Classe Carro com um Método Simples

        Carro carro = new Carro();

        carro.marca = "Fiat";
        carro.modelo = "Argo";
        carro.ano = 2020;

        carro.mostrarInformacoes();

        Carro carro2 = new Carro();

        carro2.marca = "Hyundai";
        carro2.modelo = "HB20";
        carro2.ano = 2024;

        carro2.mostrarInformacoes();

//  3. Criando a Classe Aluno com Lógica Simples

        Aluno aluno = new Aluno();
        aluno.nome = "Carlos";
        aluno.nota = 8.5;
        aluno.verificarStatus(aluno.nome, aluno.nota);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        aluno2.nota = 6.0;
        aluno2.verificarStatus(aluno2.nome, aluno2.nota);

//  4. Gerenciando uma ContaBancaria

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Juliana";
        conta.saldo = 1000.00;

        conta.depositar(500.00);
        System.out.println("Novo Saldo: " + conta.saldo);
        System.out.println("-----------------------------");

        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.saldo);
        System.out.println("-----------------------------");

        conta.sacar(1500.0); // Tentativa de saque maior que o saldo
        System.out.println("Saldo final: " + conta.saldo);
        System.out.println("-----------------------------");

//  5. Controlando o Estoque de um Produto

        Produto produto = new Produto();
        produto.nome = "Notebook Gamer";
        produto.preco = 4500.00;
        produto.estoque = 10;

        produto.adicionarEstoque(5); // Chegaram mais 5
        System.out.println("Estoque atual: " + produto.estoque);
        System.out.println("-----------------------------");


        produto.realizarVenda(8);
        System.out.println("Estoque após venda: " + produto.estoque);
        System.out.println("-----------------------------");

        produto.realizarVenda(10);
        System.out.println("Estoque atual: " + produto.estoque);
        System.out.println("-----------------------------");


    }
}
