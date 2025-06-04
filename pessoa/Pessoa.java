// Pessoa.java
public class Pessoa {
    // Atributos (Características)
    String nome;
    int idade;
    String cpf;
    String email;

    // Construtor
    public Pessoa(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    // Métodos (Ações)
    public void andar() {
        System.out.println(this.nome + " está andando.");
    }

    public void comer(String comida) {
        System.out.println(this.nome + " está comendo " + comida + ".");
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo.");
    }

    public void falar(String mensagem) {
        System.out.println(this.nome + " diz: \"" + mensagem + "\"");
    }

    // Método para mostrar informações da pessoa (Getter básico)
    public void mostrarInformacoes() {
        System.out.println("--- Dados da Pessoa ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
    }
}