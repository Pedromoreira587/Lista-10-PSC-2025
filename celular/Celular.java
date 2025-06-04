public class Celular {
    // --- Atributos (Características) ---
    String marca;
    String modelo;
    String cor;
    int capacidadeArmazenamentoGB;
    int nivelBateriaPorcentagem; // Nível da bateria de 0 a 100
    String sistemaOperacional;
    String numeroTelefone;
    boolean ligado; // Estado do celular (ligado/desligado)

    // --- Construtor ---
    // Cria um novo objeto Celular, definindo suas características iniciais.
    public Celular(String marca, String modelo, String cor, int capacidadeArmazenamentoGB, String sistemaOperacional, String numeroTelefone) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeArmazenamentoGB = capacidadeArmazenamentoGB;
        this.sistemaOperacional = sistemaOperacional;
        this.numeroTelefone = numeroTelefone;
        this.nivelBateriaPorcentagem = 100; // Por padrão, começa com 100% de bateria
        this.ligado = false; // Por padrão, o celular começa desligado
    }

    // --- Métodos (Ações) ---

    public void ligar() {
        if (!this.ligado) { // Verifica se já não está ligado
            this.ligado = true;
            System.out.println(this.marca + " " + this.modelo + " está ligando...");
        } else {
            System.out.println(this.marca + " " + this.modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado) { // Verifica se está ligado para poder desligar
            this.ligado = false;
            System.out.println(this.marca + " " + this.modelo + " está desligando...");
        } else {
            System.out.println(this.marca + " " + this.modelo + " já está desligado.");
        }
    }

    public void fazerLigacao(String numeroDestino) {
        if (this.ligado && this.nivelBateriaPorcentagem > 5) { // Precisa estar ligado e ter bateria
            System.out.println(this.numeroTelefone + " ligando para " + numeroDestino + "...");
            this.nivelBateriaPorcentagem -= 2; // Simula um pequeno consumo de bateria
            System.out.println("Bateria: " + this.nivelBateriaPorcentagem + "%.");
        } else if (!this.ligado) {
            System.out.println("O celular está desligado. Não é possível fazer ligação.");
        } else { // Bateria <= 5
            System.out.println("Bateria muito baixa (" + this.nivelBateriaPorcentagem + "%) para fazer ligação.");
        }
    }

    public void enviarMensagem(String destinatario, String texto) {
        if (this.ligado && this.nivelBateriaPorcentagem > 2) { // Precisa estar ligado e ter bateria
            System.out.println("Mensagem enviada para " + destinatario + ": \"" + texto + "\"");
            this.nivelBateriaPorcentagem -= 1; // Simula um pequeno consumo de bateria
            System.out.println("Bateria: " + this.nivelBateriaPorcentagem + "%.");
        } else if (!this.ligado) {
            System.out.println("O celular está desligado. Não é possível enviar mensagem.");
        } else { // Bateria <= 2
            System.out.println("Bateria muito baixa (" + this.nivelBateriaPorcentagem + "%) para enviar mensagem.");
        }
    }

    public void carregar(int tempoMinutos) {
        System.out.println("Carregando " + this.modelo + " por " + tempoMinutos + " minutos...");
        // Aumenta a bateria, mas não deixa passar de 100%
        this.nivelBateriaPorcentagem = Math.min(100, this.nivelBateriaPorcentagem + (tempoMinutos / 5)); // Ex: +1% a cada 5 minutos
        System.out.println("Bateria atual: " + this.nivelBateriaPorcentagem + "%.");
    }

    // Método auxiliar para mostrar o status completo do celular
    public void mostrarStatus() {
        System.out.println("\n--- Status do Celular ---");
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor + ", Armazenamento: " + this.capacidadeArmazenamentoGB + "GB");
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        System.out.println("Número: " + this.numeroTelefone);
        System.out.println("Bateria: " + this.nivelBateriaPorcentagem + "%");
        System.out.println("Status: " + (this.ligado ? "Ligado" : "Desligado")); // Operador ternário para exibir "Ligado" ou "Desligado"
    }
}