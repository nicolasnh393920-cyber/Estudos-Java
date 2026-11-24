/*

Aula referente ao uso de Records no Java moderno.

O que aprendi:

- O conceito de Record como uma estrutura concisa para transporte de dados imutáveis (denominamos isto de Data Carrier).
- Como o Record gera automaticamente construtor, atributos como 'final', métodos de leitura (name(), age()) e toString().
- Imutabilidade na prática: a impossibilidade de alterar atributos após a criação (ausência de Setters).
- Construtor alternativo usando 'this(...)': caso não seja informada a idade, assume 1 por padrão.
- Adição de métodos utilitários customizados (getInfo).
*/
public record PersonRecord(String name, int age) {

    public PersonRecord(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " Age: " + age;
    }

}