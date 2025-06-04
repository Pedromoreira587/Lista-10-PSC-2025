public class Main {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe Pessoa ---");

        // 1. Criando o primeiro objeto (instância) da classe Pessoa
        // Aqui, chamamos o construtor da classe Pessoa e passamos os valores
        // iniciais para os atributos nome, idade, cpf e email.
        Pessoa pessoa1 = new Pessoa("Ana Silva", 30, "123.456.789-00", "ana.silva@email.com");

        // 2. Chamando métodos do objeto pessoa1
        System.out.println("\n--- Ações da Pessoa 1 ---");
        pessoa1.mostrarInformacoes(); // Mostra todos os dados da Ana
        pessoa1.andar();             // Ana está andando
        pessoa1.comer("pizza");      // Ana está comendo pizza
        pessoa1.falar("Que dia lindo!"); // Ana diz algo
        pessoa1.dormir();            // Ana está dormindo

        System.out.println("\n---------------------------------");

        // 3. Criando um segundo objeto (outra instância) da classe Pessoa
        // Cada objeto é independente, mesmo que usem a mesma "planta" (classe Pessoa).
        Pessoa pessoa2 = new Pessoa("Bruno Costa", 25, "987.654.321-11", "bruno.costa@email.com");

        // 4. Chamando métodos do objeto pessoa2
        System.out.println("\n--- Ações da Pessoa 2 ---");
        pessoa2.mostrarInformacoes(); // Mostra todos os dados do Bruno
        pessoa2.andar();             // Bruno está andando
        pessoa2.comer("hambúrguer"); // Bruno está comendo hambúrguer
        pessoa2.falar("Preciso estudar Java!"); // Bruno diz algo
        pessoa2.dormir();            // Bruno está dormindo

        System.out.println("\n--- Teste da Classe Pessoa Concluído ---");
    }
}