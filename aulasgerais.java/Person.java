/*

Aula referente a orientação a objetos, encapsulamento, getters e setters.

O que aprendi: 

- Criação de classes e objetos em Java.
- Encapsulamento de atributos usando modificadores de acesso privados.
- Criação de métodos getters (getName, getAge) e setters (setName, setAge) para acessar e modificar os atributos privados.
*/

public class Person{

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}

