// Casa.java

public class Casa {
    // --- Atributos (Características) ---
    String endereco;
    int numeroQuartos;
    int numeroBanheiros;
    double tamanhoM2; // Tamanho em metros quadrados
    String corFachada;
    int anoConstrucao;
    boolean luzesAcesas; // Estado geral das luzes da casa
    boolean trancada;    // Estado da casa (trancada/destrancada)

    // --- Construtor ---
    // Cria um novo objeto Casa.
    public Casa(String endereco, int numeroQuartos, int numeroBanheiros, double tamanhoM2, String corFachada, int anoConstrucao) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
        this.tamanhoM2 = tamanhoM2;
        this.corFachada = corFachada;
        this.anoConstrucao = anoConstrucao;
        this.luzesAcesas = false; // As luzes começam apagadas
        this.trancada = true;     // A casa começa trancada por segurança
    }

    // --- Métodos (Ações) ---

    public void acenderLuzes() {
        if (!this.luzesAcesas) {
            this.luzesAcesas = true;
            System.out.println("As luzes da casa em " + this.endereco + " foram acesas.");
        } else {
            System.out.println("As luzes da casa já estão acesas.");
        }
    }

    public void apagarLuzes() {
        if (this.luzesAcesas) {
            this.luzesAcesas = false;
            System.out.println("As luzes da casa em " + this.endereco + " foram apagadas.");
        } else {
            System.out.println("As luzes da casa já estão apagadas.");
        }
    }

    public void trancar() {
        if (!this.trancada) {
            this.trancada = true;
            System.out.println("A casa em " + this.endereco + " foi trancada.");
        } else {
            System.out.println("A casa já está trancada.");
        }
    }

    public void destrancar() {
        if (this.trancada) {
            this.trancada = false;
            System.out.println("A casa em " + this.endereco + " foi destrancada.");
        } else {
            System.out.println("A casa já está destrancada.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("\n--- Detalhes da Casa ---");
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Quartos: " + this.numeroQuartos);
        System.out.println("Banheiros: " + this.numeroBanheiros);
        System.out.println("Tamanho: " + this.tamanhoM2 + " m²");
        System.out.println("Cor da Fachada: " + this.corFachada);
        System.out.println("Ano de Construção: " + this.anoConstrucao);
        System.out.println("Luzes: " + (this.luzesAcesas ? "Acesas" : "Apagadas"));
        System.out.println("Estado da Tranca: " + (this.trancada ? "Trancada" : "Destrancada"));
    }
}