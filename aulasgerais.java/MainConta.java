import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ABERTURA DE CONTA BANCÁRIA ===");
        System.out.print("Informe o valor do deposito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);
        System.out.println("Conta criada com sucesso!");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n-----------------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Saldo atual: R$ " + conta.getSaldo());

                case 2 -> System.out.println("Limite do cheque especial: R$ " + conta.getLimiteChequeEspecial());

                case 3 -> {
                    System.out.print("Digite o valor para deposito: R$ ");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                }

                case 4 -> {
                    System.out.print("Digite o valor para saque: R$ ");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                }

                case 5 -> {
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                }

                case 6 -> {
                    if (conta.isUsandoChequeEspecial()) {
                        System.out.println("AVISO: Voce esta utilizando o cheque especial!");
                    } else {
                        System.out.println("Voce nao esta usando o cheque especial.");
                    }
                }

                case 0 -> System.out.println("Encerrando o atendimento. Obrigado por usar nosso banco!");

                default -> System.out.println("Opcao invalida! Tente novamente.");
            }
        }

        scanner.close();
    }
}