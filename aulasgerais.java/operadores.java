/*
Aula referente a operadores aritméticos, relacionais e de atribuição.

O que aprendi:

- Operadores aritméticos fundamentais: adição (+), subtração (-), multiplicação (*), divisão (/) e módulo (%).
- Operadores relacionais e de comparação para construção de expressões booleanas.
- Precedência de operadores na avaliação de expressões matemáticas dentro do Java.
*/

public static void main(String[] args) {
    @SuppressWarnings("resource")
    var scanner = new Scanner(System.in);
    System.out.println("Digite um número para calcular a potência:");
    var value1 = scanner.nextDouble();
    System.out.println("A a potência de " + value1 + " é: " + Math.pow(value1, 2));
}