public class Main {
    public static void main(String[] args) {

        // * Classe é um molde para criar um objeto colocando suas caracteristicas/atributos
        // * Objeto criado sempre que utiliza o instaciamento "new"
        // * Contrutor é utilizado sempre que criado um objeto para obrigar a informar os dados dentro do parâmetro.
        //      Regras:
        //              1 - O nome do metódo tem que ser igual o nome da classe
        //              2 - Ele não tem tipo de retorno
        // * Encapsulamento é uma maneira de esconder detalhes interno da classe e evitando acessar o
        // classe, atributo e metódo diretamente - declaração de Public(liberado),
        // Private(liberado apenas para quem eu desejo e Protected(Protegido de acesso).
        //      Atributos private só podem ser modificados dentro da própria classe através de metódo (GET e SET),
        //neste caso muito comum que todos os atributos sejam private na sua declaração.
        // * Herança serve para reutilizar e herdar atributos e metódos de outras classes.
        // palavra EXTENDS representa a herança entre uma classe pai e uma filha.
        // as variaveis criadas para classe que irão utilizar herança será protected...
        // * Abstração é focar no que ele faz e não como ele faz. 

//  1. Criando a Classe Música (Apenas Atributos)

        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);
//        musica.titulo = "Bohemian Rhapsody";
//        musica.artista = "Queen";
//        musica.duracaoEmSegundos = 355;

        System.out.println("Tocando agora: " + musica.titulo);
        System.out.println("Artista: " + musica.artista);

//  2. Criando a Classe Carro com um Método Simples

        Carro carro = new Carro("Fiat", "Argo", 2020);

//        carro.marca = "Fiat";
//        carro.modelo = "Argo";
//        carro.ano = 2020;

        carro.mostrarInformacoes();


//  3. Criando a Classe Aluno com Lógica Simples

        Aluno aluno = new Aluno("Carlos", 8.5);
//        aluno.nome = "Carlos";
//        aluno.nota = 8.5;
        aluno.verificarStatus(aluno.nome, aluno.nota);

        Aluno aluno2 = new Aluno("Ana", 6.0);
//        aluno2.nome = "Ana";
//        aluno2.nota = 6.0;
        aluno2.verificarStatus(aluno2.nome, aluno2.nota);

//  4. Gerenciando uma ContaBancaria

        ContaBancaria conta = new ContaBancaria("Juliana", 1000.00);

//        conta.titular = "Juliana";
//        conta.saldo = 1000.00;

        conta.depositar(500.00);
        System.out.println("Novo Saldo: " + conta.getSaldo());
        System.out.println("-----------------------------");

        conta.sacar(200.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());
        System.out.println("-----------------------------");

        conta.sacar(1500.0);
        System.out.println("Saldo final: " + conta.getSaldo());
        System.out.println("-----------------------------");

//  5. Controlando o Estoque de um Produto

        Produto produto = new Produto("Notebool Gamer", 4500.00, 10);

//        Após a criação do contrutor na classe Produto, necessário informar os dados no parametro.
//        produto.nome = "Notebook Gamer";
//        produto.preco = 4500.00;
//        produto.estoque = 10;

        produto.adicionarEstoque(5); // Chegaram mais 5
        System.out.println("Estoque atual: " + produto.getEstoque());
        System.out.println("-----------------------------");


        produto.realizarVenda(8);
        System.out.println("Estoque após venda: " + produto.getEstoque());
        System.out.println("-----------------------------");

        produto.realizarVenda(10);
        System.out.println("Estoque atual: " + produto.getEstoque());
        System.out.println("-----------------------------");

//  6. Criando um PersonagemJogo

        PersonagemJogo jogo = new PersonagemJogo("Aragorn", 5, 100);
//        jogo.nome = "Aragorn";
//        jogo.nivel = 5;
//        jogo.pontoDeVida = 100;

        jogo.exibirStatus();

        jogo.receberDano(25);
        jogo.subirDeNivel();

        System.out.println("Após a batalha");
        jogo.exibirStatus();

//  1. Protegendo Dados do Aluno
        Alunos alunos = new Alunos("Lucas Silva", "202401");
        System.out.println("Nome do aluno: " + alunos.getNome());
        System.out.println("Matrícula: " + alunos.getMatricula());
        System.out.println("-----------------------------");

//  2. Preço Válido para o Produto

        Produtos produtos = new Produtos("Caneca");

        produtos.setPreco(25.50);
        System.out.println("Preço da " + produtos.getNome() + " é : " + produtos.getPreco());
        System.out.println("-----------------------------");

        produtos.setPreco(13.80);
        System.out.println("Preço da " + produtos.getNome() + " é : " + produtos.getPreco());
        System.out.println("-----------------------------");

        produtos.setPreco(-10.0);
        System.out.println("Preço final da " + produtos.getNome() + " é: " + produtos.getPreco());
        System.out.println("-----------------------------");

// Exercicio de Herança

//  1. Pessoa e Atleta
        Atleta atleta = new Atleta("Neymar Jr.", "Futebol");
        System.out.println("Nome: " + atleta.getNome());
        System.out.println("Esporte: " + atleta.getEsporte());
        System.out.println("-----------------------------");

//  2. Hierarquia de Veículos
        Carros carros = new Carros("Ford", 4);
        Bicicleta bicicleta = new Bicicleta("Caloi", 18);

        System.out.println("Carro: " + carros.getMarca() + " com " + carros.getNumeroDePortas() + " portas.");
        System.out.println("Bicicleta: " + bicicleta.getMarca() + " com " + bicicleta.getNumeroDeMarchas() + " marchas.");
        System.out.println("------------------------------------------------------");

//  3. Funcionário e Gerente
        Gerente gerente = new Gerente("Joana", 15000.0, "Gerente de Vendas");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("---------------------------------------------");
    }
}
