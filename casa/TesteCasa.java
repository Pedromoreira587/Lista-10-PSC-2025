// TesteCasa.java

public class TesteCasa {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Casa Separadamente ---");

        // 1. Criando o primeiro objeto (instância) da classe Casa
        System.out.println("\n--- Ações da Minha Casa ---");
        Casa minhaCasa = new Casa(
            "Rua das Flores, 123 - Centro, Ibirité", // Endereço completo
            3,      // Número de quartos
            2,      // Número de banheiros
            120.50, // Tamanho em m²
            "Amarelo",
            2010    // Ano de construção
        );
        minhaCasa.mostrarDetalhes(); // Começa com luzes apagadas e trancada

        minhaCasa.destrancar(); // Destranca a casa
        minhaCasa.acenderLuzes(); // Acende as luzes
        minhaCasa.mostrarDetalhes();

        minhaCasa.apagarLuzes(); // Apaga as luzes
        minhaCasa.trancar();     // Tranca a casa
        minhaCasa.mostrarDetalhes();

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto (outra instância) da classe Casa
        System.out.println("\n--- Ações da Casa de Praia ---");
        Casa casaDePraia = new Casa(
            "Av. Beira Mar, 456 - Ponta Negra, Natal", // Endereço completo
            4,
            3,
            200.00,
            "Azul Claro",
            2018
        );
        casaDePraia.mostrarDetalhes();
        casaDePraia.destrancar();
        casaDePraia.acenderLuzes();
        casaDePraia.mostrarDetalhes();
        casaDePraia.trancar(); // Tranca a casa de praia
        System.out.println("\n--- Teste da Classe Casa Concluído ---");
    }
}
