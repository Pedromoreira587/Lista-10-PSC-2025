
public class TesteLampada {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Lampada Separadamente ---");

        // 1. Criando o primeiro objeto (instância) da classe Lampada
        System.out.println("\n--- Lâmpada da Sala ---");
        Lampada lampadaSala = new Lampada("LED", 9, "Branca Quente");
        lampadaSala.mostrarStatus(); // Começa desligada

        lampadaSala.ligar(); // Liga a lâmpada
        lampadaSala.mostrarStatus();

        lampadaSala.ligar(); // Tenta ligar novamente (já está ligada)
        lampadaSala.desligar(); // Desliga a lâmpada
        lampadaSala.mostrarStatus();

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto (outra instância) da classe Lampada
        System.out.println("\n--- Lâmpada do Quarto ---");
        Lampada lampadaQuarto = new Lampada("Fluorescente", 15, "Branca Fria");
        lampadaQuarto.mostrarStatus();

        lampadaQuarto.ligar();
        lampadaQuarto.mostrarStatus();
        lampadaQuarto.desligar();
        lampadaQuarto.desligar(); // Tenta desligar novamente (já está desligada)
        System.out.println("\n--- Teste da Classe Lampada Concluído ---");
    }
}