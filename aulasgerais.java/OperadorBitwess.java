public void main(String[] args) {
    var value1 = 6;
    var binary1 = Integer.toBinaryString(value1);
    System.out.println("Valor I: " + value1 + " - Binário " + binary1);
    var value2 = 2;
    var binary2 = Integer.toBinaryString(value2);
    System.out.println("Valor II: " + value2 + " = Binário " + binary2);
    var result = value1 ^ value2;
    var binaryResult = Integer.toBinaryString(result);
    System.out.println("Resultado: " + result + " - Binário " + binaryResult);
}