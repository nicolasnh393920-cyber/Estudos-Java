//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados 

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.println("Informe um número (ou número com resto diferente de 0 para sair): ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue; // Volta para o início do while sem encerrar
            }
            if (numero % numeroInicial != 0) {
                System.out.println("Encerrando: " + numero + " dividido por " + numeroInicial + " tem resto " + (numero % numeroInicial) + " (diferente de 0).");
                break; // Encerra o loop
            }
            System.out.println("Divisão exata (resto 0). Continuando...");
        }
        scanner.close();
    }
}