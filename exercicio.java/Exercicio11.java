/*
Exercício 14
VERIFICADOR DE NÚMERO (PAR/ÍMPAR E POSITIVO/NEGATIVO)

Conceitos: Entrada com Scanner, operador módulo (%) e condições if/else.

*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        // Verifica se é par ou ímpar

        String paridade = (numero % 2 == 0) ? "PAR" : "ÍMPAR";
        // Verifica se é positivo, negativo ou zero
        
        String sinal;
        if (numero > 0) {
            sinal = "POSITIVO";
        } else if (numero < 0) {
            sinal = "NEGATIVO";
        } else {
            sinal = "ZERO (NEUTRO)";
        }
        System.out.println("O número " + numero + " é " + paridade + " e " + sinal + ".");

        scanner.close();
    }
}