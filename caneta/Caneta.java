// Caneta.java

public class Caneta {
    // --- Atributos (Características) ---
    String corTinta;
    String tipo; // Ex: esferográfica, gel, hidrográfica
    double espessuraTraco; // Ex: 0.5, 0.7, 1.0 mm
    String marca;
    int nivelTintaPorcentagem; // Nível da tinta de 0 a 100%

    // --- Construtor ---
    // Cria um novo objeto Caneta.
    public Caneta(String corTinta, String tipo, double espessuraTraco, String marca) {
        this.corTinta = corTinta;
        this.tipo = tipo;
        this.espessuraTraco = espessuraTraco;
        this.marca = marca;
        this.nivelTintaPorcentagem = 100; // Caneta nova começa com 100% de tinta
    }

    // --- Métodos (Ações) ---

    public void escrever(String texto) {
        if (this.nivelTintaPorcentagem > 0) {
            System.out.println("Escrevendo com a caneta " + this.corTinta + ": \"" + texto + "\"");
            // Simula um consumo de tinta
            this.nivelTintaPorcentagem = Math.max(0, this.nivelTintaPorcentagem - (texto.length() / 10 + 1));
            System.out.println("Nível de tinta: " + this.nivelTintaPorcentagem + "%.");
        } else {
            System.out.println("A caneta " + this.corTinta + " está sem tinta. Por favor, recarregue.");
        }
    }

    public void recarregar() {
        if (this.nivelTintaPorcentagem < 100) {
            this.nivelTintaPorcentagem = 100;
            System.out.println("A caneta " + this.corTinta + " foi recarregada para 100%.");
        } else {
            System.out.println("A caneta " + this.corTinta + " já está com a tinta cheia.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("\n--- Detalhes da Caneta ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor da Tinta: " + this.corTinta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Espessura do Traço: " + this.espessuraTraco + " mm");
        System.out.println("Nível de Tinta: " + this.nivelTintaPorcentagem + "%");
    }
}