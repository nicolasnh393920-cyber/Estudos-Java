/*
Aula referente a modelagem inicial de dados e atributos de uma entidade.

O que aprendi:

- Como representar uma entidade do mundo real (ou seja, o Cliente) através de variáveis de instância.
- Definição de atributos fundamentais como nome, idade e dados de identificação.
- Estruturação inicial do código antes da aplicação de métodos de comportamento.
*/

public class Cliente {
    String nomeCompleto;
    double saldoEmConta;

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nomeCompleto = "João da Silva";
        cliente.saldoEmConta = 1000.0;
        cliente.exibirDados();
    }

    public void exibirDados() {
        System.out.println("Titular: " + nomeCompleto);
        System.out.println("Saldo: R$ " + saldoEmConta);
    }
}