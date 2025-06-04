// Televisao.java

public class Televisao {
    // --- Atributos (Características) ---
    String marca;
    String modelo;
    double tamanhoTelaPolegadas;
    String resolucao; // Ex: "Full HD", "4K", "8K"
    boolean ligada; // true se estiver ligada, false se desligada
    int canalAtual;
    int volume; // Nível do volume de 0 a 100

    // --- Construtor ---
    // Cria um novo objeto Televisao.
    public Televisao(String marca, String modelo, double tamanhoTelaPolegadas, String resolucao) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
        this.resolucao = resolucao;
        this.ligada = false; // Televisão começa desligada
        this.canalAtual = 1; // Canal padrão ao ligar
        this.volume = 20;    // Volume padrão
    }

    // --- Métodos (Ações) ---

    public void ligar() {
        if (!this.ligada) {
            this.ligada = true;
            System.out.println(this.marca + " " + this.modelo + " está ligando...");
            System.out.println("Canal: " + this.canalAtual + ", Volume: " + this.volume);
        } else {
            System.out.println(this.marca + " " + this.modelo + " já está ligada.");
        }
    }

    public void desligar() {
        if (this.ligada) {
            this.ligada = false;
            System.out.println(this.marca + " " + this.modelo + " está desligando.");
        } else {
            System.out.println(this.marca + " " + this.modelo + " já está desligada.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (this.ligada) {
            if (novoCanal > 0 && novoCanal <= 999) { // Limite de canal arbitrário
                this.canalAtual = novoCanal;
                System.out.println("Mudando para o canal: " + this.canalAtual);
            } else {
                System.out.println("Canal inválido. Por favor, escolha um canal entre 1 e 999.");
            }
        } else {
            System.out.println("A TV está desligada. Ligue-a para mudar de canal.");
        }
    }

    public void aumentarVolume(int incremento) {
        if (this.ligada) {
            this.volume = Math.min(100, this.volume + incremento); // Volume máximo 100
            System.out.println("Volume aumentado para: " + this.volume);
        } else {
            System.out.println("A TV está desligada. Ligue-a para ajustar o volume.");
        }
    }

    public void diminuirVolume(int decremento) {
        if (this.ligada) {
            this.volume = Math.max(0, this.volume - decremento); // Volume mínimo 0
            System.out.println("Volume diminuído para: " + this.volume);
        } else {
            System.out.println("A TV está desligada. Ligue-a para ajustar o volume.");
        }
    }

    public void mostrarStatus() {
        System.out.println("\n--- Status da Televisão ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tela: " + this.tamanhoTelaPolegadas + " polegadas");
        System.out.println("Resolução: " + this.resolucao);
        System.out.println("Estado: " + (this.ligada ? "Ligada" : "Desligada"));
        if (this.ligada) { // Só mostra canal e volume se estiver ligada
            System.out.println("Canal Atual: " + this.canalAtual);
            System.out.println("Volume: " + this.volume);
        }
    }
}