/*
Aula referente a controle de fluxo e ramificações condicionais.

O que aprendi:

- O funcionamento fundamental dos blocos 'if', 'else if' e 'else' na tomada de decisões.
- Como encadear múltiplas condições para cobrir diferentes cenários de execução.
- Importância da ordem de avaliação das expressões lógicas para evitar comportamentos inesperados.
*/

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Seu nome: ");
        var nome = scanner.nextLine();

        System.out.println("Sua idade: ");
        var idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        System.out.println("Você é emancipado? (s/n)");
        var emancipado = scanner.nextLine();

        // Aqui é a estrutura condicional
        if (idade >= 18) {
            System.out.println("Olá, " + nome + "! Você pode dirigir.");
        } else if (idade >= 16 && emancipado.equalsIgnoreCase("s")) {
            System.out.println("Olá, " + nome + "! Você não tem a idade padrão (18), porém é emancipado/a, logo, pode dirigir.");
        } else {
            System.out.println("Olá, " + nome + "! Você não pode dirigir.");
        }

        scanner.close();
    }
}