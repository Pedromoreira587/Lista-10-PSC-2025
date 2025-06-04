// TesteCaneta.java

public class TesteCaneta {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Caneta Separadamente ---");

        // 1. Criando o primeiro objeto (instância) da classe Caneta
        System.out.println("\n--- Minha Caneta Azul ---");
        Caneta canetaAzul = new Caneta("Azul", "Esferográfica", 0.7, "Bic");
        canetaAzul.mostrarDetalhes(); // Começa com 100% de tinta

        canetaAzul.escrever("Olá, mundo!"); // Escreve e consome tinta
        canetaAzul.escrever("Este é um teste de consumo de tinta da minha caneta azul.");
        canetaAzul.mostrarDetalhes(); // Verifica o nível de tinta atual

        canetaAzul.recarregar(); // Recarrega a caneta
        canetaAzul.mostrarDetalhes(); // Mostra que a tinta voltou a 100%

        canetaAzul.escrever("Mais um pouco de texto para gastar a tinta rapidamente.");
        canetaAzul.escrever("Escrevendo bastante para ver a caneta sem tinta.");
        canetaAzul.escrever("Mais uma frase.");
        canetaAzul.escrever("Chegou ao fim da tinta, agora não vai escrever mais.");
        canetaAzul.mostrarDetalhes();
        canetaAzul.escrever("Tentando escrever sem tinta."); // Tenta escrever sem tinta

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto (outra instância) da classe Caneta
        System.out.println("\n--- Caneta Marca Texto Verde ---");
        Caneta canetaMarcaTexto = new Caneta("Verde", "Hidrográfica", 4.0, "Faber-Castell");
        canetaMarcaTexto.mostrarDetalhes();

        canetaMarcaTexto.escrever("Este é um texto para destacar.");
        canetaMarcaTexto.mostrarDetalhes();
        canetaMarcaTexto.recarregar();
        System.out.println("\n--- Teste da Classe Caneta Concluído ---");
    }
}