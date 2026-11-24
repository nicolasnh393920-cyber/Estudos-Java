/*

Aula referente a orientação a objetos, encapsulamento, getters e setters.

O que aprendi: 

- Diferença entre Classe (molde) e o Objeto (instância na memória)
- Uso da palavra-chave "new" para instanciar objetos independentes a partir da mesma classe.
- Cada objeto instanciado possui seu próprio estado na memória (male com seus dados e female com os seus dados).
- Chamada dos métodos de acesso (getters e setters) respeitando o princípio do encapsulamento cobrado desde o início de um projeto ou a criação de uma empresa
*/

public class Main {
    
    public static void main(String[] args) {
        var male = new Person();
        male.setName("João");
        male.setAge(20);
        var female = new Person();
        female.setName("Maria");
        female.setAge(22);
        System.out.println("Nome:" + male.getName() + " age: " + male.getAge());
        System.out.println("Nome: " + female.getName() + " age: " + female.getAge());

    }
}
