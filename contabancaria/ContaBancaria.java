// ContaBancaria.java

public class ContaBancaria {
    // --- Atributos (Características) ---
    String numeroConta;
    String nomeTitular;
    double saldo; // O saldo atual da conta
    String tipoConta; // Ex: "Corrente", "Poupança"
    String agencia;

    // --- Construtor ---
    // Cria um novo objeto ContaBancaria.
    // O saldo inicial é sempre zero, depósitos são feitos depois.
    public ContaBancaria(String numeroConta, String nomeTitular, String tipoConta, String agencia) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.saldo = 0.0; // Saldo inicial sempre 0.0
    }

    // --- Métodos (Ações) ---

    public void depositar(double valor) {
        if (valor > 0) { // O valor do depósito deve ser positivo
            this.saldo += valor; // Adiciona o valor ao saldo
            // Usamos printf para formatar o valor monetário com duas casas decimais
            System.out.printf("Depósito de R$%.2f realizado na conta %s. Novo saldo: R$%.2f%n", valor, this.numeroConta, this.saldo);
        } else {
            System.out.println("Valor de depósito inválido. Deve ser um valor positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) { // O valor deve ser positivo e menor ou igual ao saldo
            this.saldo -= valor; // Subtrai o valor do saldo
            System.out.printf("Saque de R$%.2f realizado da conta %s. Novo saldo: R$%.2f%n", valor, this.numeroConta, this.saldo);
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido. Deve ser um valor positivo.");
        } else {
            System.out.printf("Saldo insuficiente na conta %s para sacar R$%.2f. Saldo atual: R$%.2f%n", this.numeroConta, valor, this.saldo);
        }
    }

    // Método para transferir dinheiro para outra conta bancária
    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && valor <= this.saldo) { // Verifica se há saldo suficiente na conta de origem
            this.sacar(valor); // Primeiro, saca o valor da conta atual
            contaDestino.depositar(valor); // Depois, deposita na conta de destino
            System.out.printf("Transferência de R$%.2f da conta %s para a conta %s realizada com sucesso.%n", valor, this.numeroConta, contaDestino.numeroConta);
        } else if (valor <= 0) {
            System.out.println("Valor de transferência inválido. Deve ser um valor positivo.");
        } else {
            System.out.printf("Saldo insuficiente na conta %s para transferir R$%.2f. Saldo atual: R$%.2f%n", this.numeroConta, valor, this.saldo);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s (%s): R$%.2f%n", this.numeroConta, this.nomeTitular, this.saldo);
    }

    // Método auxiliar para mostrar todos os dados da conta
    public void mostrarDadosConta() {
        System.out.println("\n--- Dados da Conta Bancária ---");
        System.out.println("Titular: " + this.nomeTitular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Tipo de Conta: " + this.tipoConta);
        System.out.println("Agência: " + this.agencia);
        this.consultarSaldo(); // Chama o método de consulta de saldo para exibir o saldo atual
    }
}