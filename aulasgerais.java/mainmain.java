/*

Aula referente ao uso de Records no Java moderno - Execução e Testes.
Relação: Este arquivo é a classe principal de execução que consome e testa o record 'PersonRecord.java'.

O que aprendi e testei neste arquivo:

- Instanciação de um Record com múltiplos parâmetros (new PersonRecord("João", 25)).
- Uso do construtor sobrecarregado/alternativo que define valores padrão (new PersonRecord("Maria")).
- Aproveitamento do método toString() gerado automaticamente pelo Java (impressão direta do objeto).
- Acesso aos atributos imutáveis através dos métodos canônicos (pessoa.name() e pessoa.age()).
- Execução de métodos utilitários customizados declarados no corpo do record (pessoa.getInfo()).
*/

public class mainmain {
    public static void main(String[] args) {

        // Criando a pessoa com Nome e Idade
        var pessoa1 = new PersonRecord("João", 25);

        // Criando uma pessoa passando APENAS o Nome (vai usar idade padrão 1)
        var pessoa2 = new PersonRecord("Maria");

        // 1. O Record imprime bonito automaticamente!
        System.out.println("Impressão automática do Record:");
        System.out.println(pessoa1);
        System.out.println(pessoa2);

        System.out.println("----------------------------------");

        // 2. Lendo os dados individuais (repare: não é getName(), é direto .name()!)
        System.out.println("Lendo direto com o método gerado:");
        System.out.println("Nome: " + pessoa1.name());
        System.out.println("Idade: " + pessoa1.age());

        System.out.println("----------------------------------");

        // 3. Chamando nosso método customizado getInfo()
        System.out.println("Método customizado:");
        System.out.println(pessoa1.getInfo());
        System.out.println(pessoa2.getInfo());
    }
}

