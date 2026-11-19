public static void main(String[] args) {
var scanner = new Scanner(System.in);
System.out.println("Quantos anos você tem?");
var idade = scanner.nextInt();
System.out.println("Você é emancipado? (true/false)");
var emancipado = scanner.nextBoolean();
var canDrive = idade >= 16 && emancipado;
System.out.println("Você pode dirigir? " + canDrive);
scanner.close();}
