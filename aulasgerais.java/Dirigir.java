/*
Aula referente a estruturas condicionais e regras de negócio lógicas no dia a dia.

O que aprendi:

- Aplicação de estruturas de decisão (o famoso "if" e "else") para validar regras do mundo real (ex: permissão para dirigir baseada na idade).
- Uso de operadores de comparação (>=, <=, ==) para tomar decisões de fluxo.
- Criação de mensagens claras e dinâmicas de saída para o usuário de acordo com o resultado da condição.
*/

public static void main(String[] args) {
var scanner = new Scanner(System.in);
System.out.println("Quantos anos você tem?");
var idade = scanner.nextInt();
System.out.println("Você é emancipado? (true/false)");
var emancipado = scanner.nextBoolean();
var canDrive = idade >= 16 && emancipado;
System.out.println("Você pode dirigir? " + canDrive);
scanner.close();}
