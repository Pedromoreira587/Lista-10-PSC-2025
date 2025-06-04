// Animal.java

public class Animal {
    // --- Atributos (Características) ---
    String especie;
    String nome;
    int idade;
    String corDoPelo; // ou corDaPena/corDaPele, dependendo da espécie

    // --- Construtor ---
    // Cria um novo objeto Animal.
    public Animal(String especie, String nome, int idade, String corDoPelo) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        this.corDoPelo = corDoPelo;
    }

    // --- Métodos (Ações) ---

    public void comer(String alimento) {
        System.out.println(this.nome + " (" + this.especie + ") está comendo " + alimento + ".");
    }

    public void dormir() {
        System.out.println(this.nome + " (" + this.especie + ") está dormindo.");
    }

    public void emitirSom() {
        // Um método genérico para emitir som. Pode ser especializado em subclasses.
        System.out.println(this.nome + " (" + this.especie + ") faz um som.");
    }

    public void mostrarInformacoes() {
        System.out.println("\n--- Dados do Animal ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Cor do Pelo/Pena: " + this.corDoPelo);
    }
}