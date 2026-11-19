

public void main(String[] args) {
    @SuppressWarnings("resource")
    var scanner = new Scanner(System.in);
    System.out.println("Digite um número para calcular a potência:");
    var value1 = scanner.nextDouble();
    System.out.println("A a potência de " + value1 + " é: " + Math.pow(value1, 2));
}