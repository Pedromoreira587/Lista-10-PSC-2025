public class TesteCelular{

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Celular Separadamente ---");

        // 1. Criando um objeto (instância) da classe Celular
        System.out.println("\n--- Ações do Meu Smartphone ---");
        Celular meuSmartphone = new Celular(
            "Samsung",
            "Galaxy S24",
            "Preto",
            256, // Capacidade de armazenamento em GB
            "Android",
            "11 99876-5432" // Número de telefone
        );
        meuSmartphone.mostrarStatus(); // Começa desligado e com 100% de bateria

        meuSmartphone.desligar(); // Tenta desligar (já está desligado)
        meuSmartphone.ligar();    // Liga o celular
        meuSmartphone.mostrarStatus();

        meuSmartphone.fazerLigacao("11 1234-5678"); // Faz uma ligação
        meuSmartphone.enviarMensagem("João", "Nos encontramos às 15h no centro."); // Envia uma mensagem
        meuSmartphone.mostrarStatus(); // Veja o consumo de bateria

        meuSmartphone.fazerLigacao("11 9999-0000"); // Outra ligação
        meuSmartphone.enviarMensagem("Maria", "Chegando em 5 minutos."); // Outra mensagem
        meuSmartphone.mostrarStatus();

        System.out.println("\n--- Carregando o celular ---");
        meuSmartphone.carregar(60); // Carrega por 60 minutos
        meuSmartphone.mostrarStatus(); // Bateria deve ter subido

        meuSmartphone.desligar(); // Desliga o celular
        meuSmartphone.mostrarStatus();

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto Celular (outro telefone)
        System.out.println("\n--- Ações do Celular da Amiga ---");
        Celular celularAmiga = new Celular(
            "Apple",
            "iPhone 15 Pro",
            "Branco",
            128,
            "iOS",
            "21 98765-4321"
        );
        celularAmiga.mostrarStatus();
        celularAmiga.ligar();
        celularAmiga.fazerLigacao("21 2222-3333");
        celularAmiga.mostrarStatus();
        celularAmiga.desligar();

        System.out.println("\n--- Teste da Classe Celular Concluído ---");
    }
} 
