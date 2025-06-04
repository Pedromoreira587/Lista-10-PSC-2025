// Livro.java

public class Livro {
    // --- Atributos (Características) ---
    String titulo;
    String autor;
    String genero;
    int numeroPaginas;
    String editora;
    int anoPublicacao;
    int paginaAtual; // Para controlar em qual página o leitor está

    // --- Construtor ---
    // Cria um novo objeto Livro com seus dados iniciais.
    public Livro(String titulo, String autor, String genero, int numeroPaginas, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.paginaAtual = 0; // Um livro começa "fechado" na página 0 (ou capa)
    }

    // --- Métodos (Ações) ---

    public void abrir() {
        System.out.println("Abrindo o livro \"" + this.titulo + "\".");
        if (this.paginaAtual == 0) { // Se estiver na capa (0), vai para a primeira página
            this.paginaAtual = 1;
        }
        System.out.println("Você está na página " + this.paginaAtual + ".");
    }

    public void fechar() {
        System.out.println("Fechando o livro \"" + this.titulo + "\".");
        // Poderíamos, em um sistema mais complexo, salvar a paginaAtual aqui para continuar a leitura depois.
    }

    public void lerPagina(int pagina) {
        // Validação para garantir que a página seja válida
        if (pagina > 0 && pagina <= this.numeroPaginas) {
            this.paginaAtual = pagina;
            System.out.println("Lendo a página " + this.paginaAtual + " de \"" + this.titulo + "\".");
        } else {
            System.out.println("Página inválida. Este livro tem " + this.numeroPaginas + " páginas. Você está na página " + this.paginaAtual + ".");
        }
    }

    public void proximaPagina() {
        if (this.paginaAtual < this.numeroPaginas) {
            this.paginaAtual++;
            System.out.println("Virando para a próxima página: " + this.paginaAtual + ".");
        } else {
            System.out.println("Você chegou ao final do livro \"" + this.titulo + "\".");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("\n--- Detalhes do Livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Páginas: " + this.numeroPaginas);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Página atual: " + this.paginaAtual + " (0 = capa/fechado)");
    }
}