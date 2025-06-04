// TesteLivro.java

public class TesteLivro {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Livro Separadamente ---");

        // 1. Criando um objeto (instância) da classe Livro
        System.out.println("\n--- Ações do Meu Livro Favorito ---");
        Livro meuLivro = new Livro(
            "O Pequeno Príncipe",
            "Antoine de Saint-Exupéry",
            "Fábula/Filosofia",
            96, // Número de páginas
            "Agir",
            1943
        );
        meuLivro.mostrarDetalhes(); // Mostra os detalhes iniciais (página 0)

        meuLivro.abrir(); // Abre o livro, vai para a página 1
        meuLivro.proximaPagina(); // Vira para a página 2
        meuLivro.proximaPagina(); // Vira para a página 3
        meuLivro.mostrarDetalhes(); // Mostra a página atual

        meuLivro.lerPagina(50); // Pula para a página 50
        meuLivro.proximaPagina(); // Vira para a página 51
        meuLivro.mostrarDetalhes();

        meuLivro.lerPagina(100); // Tenta ir para uma página inválida (livro tem 96)
        meuLivro.lerPagina(96); // Vai para a última página
        meuLivro.proximaPagina(); // Tenta virar a página depois da última
        meuLivro.mostrarDetalhes();

        meuLivro.fechar(); // Fecha o livro

        System.out.println("\n------------------------------------");

        // 2. Criando um segundo objeto Livro para demonstrar independência
        System.out.println("\n--- Ações de Outro Livro ---");
        Livro livroDidatico = new Livro(
            "Introdução à Programação Java",
            "Deitel & Deitel",
            "Programação",
            800,
            "Pearson",
            2022
        );
        livroDidatico.mostrarDetalhes();
        livroDidatico.abrir();
        livroDidatico.lerPagina(150);
        livroDidatico.fechar();

        System.out.println("\n--- Teste da Classe Livro Concluído ---");
    }
}