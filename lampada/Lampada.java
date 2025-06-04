// Lampada.java

public class Lampada {
    // --- Atributos (Características) ---
    String tipo; // Ex: LED, Fluorescente, Incandescente
    int potenciaWatts;
    String corDaLuz; // Ex: Branca, Amarela, RGB
    boolean ligada; // true se estiver ligada, false se desligada

    // --- Construtor ---
    // Cria um novo objeto Lampada.
    public Lampada(String tipo, int potenciaWatts, String corDaLuz) {
        this.tipo = tipo;
        this.potenciaWatts = potenciaWatts;
        this.corDaLuz = corDaLuz;
        this.ligada = false; // Por padrão, a lâmpada começa desligada
    }

    // --- Métodos (Ações) ---

    public void ligar() {
        if (!this.ligada) { // Só liga se não estiver já ligada
            this.ligada = true;
            System.out.println("A lâmpada (" + this.tipo + " " + this.potenciaWatts + "W) está ligada.");
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    public void desligar() {
        if (this.ligada) { // Só desliga se estiver ligada
            this.ligada = false;
            System.out.println("A lâmpada (" + this.tipo + " " + this.potenciaWatts + "W) está desligada.");
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    public void mostrarStatus() {
        System.out.println("\n--- Status da Lâmpada ---");
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Potência: " + this.potenciaWatts + "W");
        System.out.println("Cor da Luz: " + this.corDaLuz);
        System.out.println("Estado: " + (this.ligada ? "Ligada" : "Desligada")); // Operador ternário
    }
}