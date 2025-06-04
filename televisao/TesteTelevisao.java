// TesteTelevisao.java

public class TesteTelevisao {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Televisao Separadamente ---");

        // 1. Criando o primeiro objeto (instância) da classe Televisao
        System.out.println("\n--- Minha TV da Sala ---");
        Televisao tvSala = new Televisao("Samsung", "Neo QLED", 65.0, "4K");
        tvSala.mostrarStatus(); // Começa desligada

        tvSala.ligar(); // Liga a TV
        tvSala.mudarCanal(7); // Muda para o canal 7
        tvSala.aumentarVolume(10); // Aumenta o volume em 10
        tvSala.mostrarStatus();

        tvSala.diminuirVolume(5); // Diminui o volume em 5
        tvSala.mudarCanal(1500); // Tenta mudar para um canal inválido
        tvSala.mostrarStatus();

        tvSala.desligar(); // Desliga a TV
        tvSala.mostrarStatus();

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto (outra instância) da classe Televisao
        System.out.println("\n--- TV do Quarto ---");
        Televisao tvQuarto = new Televisao("LG", "OLED Evo", 48.0, "Full HD");
        tvQuarto.mostrarStatus();

        tvQuarto.ligar();
        tvQuarto.mudarCanal(25);
        tvQuarto.aumentarVolume(5);
        tvQuarto.mostrarStatus();
        tvQuarto.desligar();

        System.out.println("\n--- Teste da Classe Televisao Concluído ---");
    }
}