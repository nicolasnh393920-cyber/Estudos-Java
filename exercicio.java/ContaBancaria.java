/*
Exercício 11
CONTA BANCÁRIA COM CHEQUE ESPECIAL

Considere: 
Parte A - Criar uma conta que nasce com um depósito inicial e já calcula o limite de crédito (cheque especial).
Parte B - Fazer as operações financeiras (sacar, depositar, pagar boleto, consultar).
Parte C - Criar um menu interativo na tela para o usuário escolher o que quer fazer até decidir sair.

REGRA DO EXERCÍCIO:
//Se depositoInicial <= 500 -> limite = 50
// Senão -> limite = 50% de depositoInicial

*/

public class ContaBancaria {
    
    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;
  
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else { 
            this.limiteChequeEspecial = depositoInicial * 0.50;
        }
    }
    
    public double getSaldo() { 
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo = saldo + valor;
    }

    public boolean sacar(double valor) {
        if (saldo + (limiteChequeEspecial - valorUsadoChequeEspecial) >= valor) {
            if (valor <= saldo) {
                saldo = saldo - valor;
            } else {
                double restante = valor - saldo; 
                saldo = 0;                       
                valorUsadoChequeEspecial = valorUsadoChequeEspecial + restante;
                System.out.println("Voce entrou no cheque especial! Valor usado: R$ " + valorUsadoChequeEspecial);
            }

            System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saque indisponivel. Saldo e limite insuficientes.");
            return false;
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("Processando pagamento de boleto...");
        sacar(valor);
    }

    public boolean isUsandoChequeEspecial() {
        return valorUsadoChequeEspecial > 0;
    }
}