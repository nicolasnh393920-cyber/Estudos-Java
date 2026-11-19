public class Cliente {
    String nomeCompleto;
    double saldoEmConta;

    public void exibirDados() {
        System.out.println("Titular: " + nomeCompleto);
        System.out.println("Saldo: R$ " + saldoEmConta);
    }
}