// TesteContaBancaria.java

public class TesteContaBancaria {

    public static void main(String[] args) {
        System.out.println("--- Testando a Classe ContaBancaria Separadamente ---");

        // 1. Criando o primeiro objeto (instância) da classe ContaBancaria
        System.out.println("\n--- Conta da Maria ---");
        ContaBancaria contaMaria = new ContaBancaria("12345-6", "Maria Oliveira", "Corrente", "001");
        contaMaria.mostrarDadosConta(); // Mostra o saldo inicial (R$0.00)

        contaMaria.depositar(1000.00); // Maria deposita R$1000
        contaMaria.sacar(250.00);    // Maria saca R$250
        contaMaria.consultarSaldo(); // Consulta o saldo atual

        contaMaria.sacar(800.00);    // Maria tenta sacar mais do que tem (saldo insuficiente)
        contaMaria.consultarSaldo();

        System.out.println("\n-------------------------------------------");

        // 2. Criando um segundo objeto (outra instância) da classe ContaBancaria
        System.out.println("\n--- Conta do João ---");
        ContaBancaria contaJoao = new ContaBancaria("78901-2", "João Pereira", "Poupança", "001");
        contaJoao.mostrarDadosConta();

        contaJoao.depositar(300.00); // João deposita R$300
        contaJoao.consultarSaldo();

        System.out.println("\n--- Testando a transferência entre contas ---");
        // Maria transfere R$150 para João
        contaMaria.transferir(150.00, contaJoao);

        contaMaria.mostrarDadosConta(); // Verifica o saldo da Maria após a transferência
        contaJoao.mostrarDadosConta();  // Verifica o saldo do João após receber a transferência

        System.out.println("\n--- Teste da Classe ContaBancaria Concluído ---");
    }
}