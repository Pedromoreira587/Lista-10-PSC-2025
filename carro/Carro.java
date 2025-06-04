// Carro.java

public class Carro {
    // --- Atributos (Características) ---
    // Representam o estado de um objeto Carro.
    String marca;
    String modelo;
    int ano;
    String cor;
    String placa;
    double velocidadeAtual; // Para simular a velocidade ao acelerar/frear

    // --- Construtor ---
    // Usado para criar um novo objeto Carro, definindo seus atributos iniciais.
    public Carro(String marca, String modelo, int ano, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.velocidadeAtual = 0.0; // Todo carro novo começa parado
    }

    // --- Métodos (Ações) ---
    // Definem o comportamento de um objeto Carro.

    public void ligar() {
        System.out.println(this.marca + " " + this.modelo + " está ligado.");
    }

    public void desligar() {
        System.out.println(this.marca + " " + this.modelo + " está desligado.");
        this.velocidadeAtual = 0.0; // A velocidade zera ao desligar o carro
    }

    public void acelerar(double incrementoVelocidade) {
        if (incrementoVelocidade > 0) {
            this.velocidadeAtual += incrementoVelocidade; // Aumenta a velocidade atual
            System.out.println(this.modelo + " acelerou para " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("O incremento de velocidade deve ser um valor positivo.");
        }
    }

    public void frear(double decrementoVelocidade) {
        if (decrementoVelocidade > 0) {
            // Garante que a velocidade não fique negativa
            this.velocidadeAtual = Math.max(0, this.velocidadeAtual - decrementoVelocidade);
            System.out.println(this.modelo + " freou para " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("O decremento de velocidade deve ser um valor positivo.");
        }
    }

    // Método auxiliar para mostrar o status completo do carro
    public void mostrarStatus() {
        System.out.println("\n--- Status do Carro ---");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }
}