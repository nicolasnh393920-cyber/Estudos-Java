//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;  

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número (menor): ");
    int num1 = scanner.nextInt();
    System.out.println("Digite o segundo número (maior que o primeiro): ");
    int num2 = scanner.nextInt();
    System.out.println("Escolha a opção (1 para PAR, 2 para ÍMPAR): ");
    int opcao = scanner.nextInt();
    System.out.println("\nResultado em ordem decrescente:");

        for (int i = num2; i >= num1; i--) {
            if (opcao == 1 && i % 2 == 0) {
               
                System.out.println(i);
            } else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}