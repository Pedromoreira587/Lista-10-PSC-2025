// TesteAnimal.java

public class TesteAnimal {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Animal Separadamente ---");

        // 1. Criando o primeiro objeto (instância) da classe Animal
        System.out.println("\n--- Ações do Cachorro Bob ---");
        Animal cachorroBob = new Animal("Cachorro", "Bob", 3, "Marrom");
        cachorroBob.mostrarInformacoes();

        cachorroBob.comer("ração");
        cachorroBob.emitirSom(); // Bob faz um som
        cachorroBob.dormir();

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto (outra instância) da classe Animal
        System.out.println("\n--- Ações da Gata Mia ---");
        Animal gataMia = new Animal("Gato", "Mia", 2, "Branca");
        gataMia.mostrarInformacoes();

        gataMia.comer("peixe");
        gataMia.emitirSom(); // Mia faz um som
        gataMia.dormir();

        System.out.println("\n--- Teste da Classe Animal Concluído ---");
    }
}