// TesteCarro.java

public class TesteCarro {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Carro Separadamente ---");

        // Criando o primeiro objeto (instância) da classe Carro
        System.out.println("\n--- Ações do Meu Carro ---");
        Carro meuCarro = new Carro("Toyota", "Corolla", 2023, "Prata", "ABC-1234");
        meuCarro.mostrarStatus(); // Mostra o status inicial (velocidade 0)

        meuCarro.ligar(); // Liga o carro
        meuCarro.acelerar(50.0); // Acelera para 50 km/h
        meuCarro.mostrarStatus(); // Verifica a nova velocidade

        meuCarro.frear(20.0); // Freia 20 km/h
        meuCarro.mostrarStatus(); // Verifica a velocidade após frear

        meuCarro.desligar(); // Desliga o carro
        meuCarro.mostrarStatus(); // Verifica que a velocidade voltou a 0

        System.out.println("\n-------------------------------------------");

        // Criando um segundo objeto (outra instância) da classe Carro
        System.out.println("\n--- Ações do Carro do Vizinho ---");
        Carro carroVizinho = new Carro("Honda", "Civic", 2020, "Preto", "DEF-5678");
        carroVizinho.mostrarStatus(); // Status inicial do carro do vizinho

        carroVizinho.ligar();
        carroVizinho.acelerar(120.0);
        carroVizinho.frear(50.0);
        carroVizinho.mostrarStatus();

        System.out.println("\n--- Teste da Classe Carro Concluído ---");
    }
}