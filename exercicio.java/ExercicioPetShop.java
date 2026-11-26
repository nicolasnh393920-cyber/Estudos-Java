/*
Exercício 13
CONTROLE DA MÁQUINA DE BANHO DE PET SHOP

Considere: 
Parte A - Modelar a máquina de banho para pets com reservatórios de água e shampoo.
Parte B - Aplicar regras de consumo de recursos, capacidade máxima e contaminação/higienização da máquina.
Parte C - Criar um menu interativo que permite operar a máquina até o usuário decidir sair.

REGRAS DO EXERCÍCIO:
// A máquina de banho permite somente 1 pet por vez.
// Cada banho realizado consome 10 litros de água e 2 litros de shampoo.
// Capacidade máxima: 30 litros de água e 10 litros de shampoo.
// O abastecimento de água e shampoo adiciona 2 litros por vez que for acionado.
// Se o pet for retirado da máquina sem estar limpo, a máquina fica suja e bloqueia a entrada de outro pet.
// A limpeza da máquina consome 3 litros de água e 1 litro de shampoo.
*/



import java.util.Scanner;

class MaquinaBanho {
    private int agua;       // capacidade máxima 30L
    private int shampoo;    // capacidade máxima 10L
    private boolean temPet;
    private boolean petLimpo;
    private boolean maquinaSuja;

    public MaquinaBanho() {
        this.agua = 0;
        this.shampoo = 0;
        this.temPet = false;
        this.petLimpo = false;
        this.maquinaSuja = false;
    }

    public void abastecerAgua() {
        if (agua + 2 <= 30) {
            agua += 2;
            System.out.println("Abastecido 2L de agua. Nivel atual: " + agua + "/30L");
        } else {
            System.out.println("Reservatorio cheio! Nao cabe mais agua (Nivel: " + agua + "/30L).");
        }
    }

    public void abastecerShampoo() {
        if (shampoo + 2 <= 10) {
            shampoo += 2;
            System.out.println("Abastecido 2L de shampoo. Nivel atual: " + shampoo + "/10L");
        } else {
            System.out.println("Reservatorio cheio! Nao cabe mais shampoo (Nivel: " + shampoo + "/10L).");
        }
    }

    public void colocarPet() {
        if (temPet) {
            System.out.println("Aviso: Ja existe um pet dentro da maquina (limite de 1 por vez)!");
            return;
        }
        if (maquinaSuja) {
            System.out.println("Aviso: A maquina esta suja! Higienize a maquina antes de colocar outro pet.");
            return;
        }
        temPet = true;
        petLimpo = false;
        System.out.println("Pet colocado na maquina com sucesso!");
    }

    public void darBanho() {
        if (!temPet) {
            System.out.println("Nenhum pet encontrado na maquina para dar banho!");
            return;
        }
        if (petLimpo) {
            System.out.println("O pet ja esta limpo e cheiroso!");
            return;
        }

        if (agua >= 10 && shampoo >= 2) {
            agua -= 10;
            shampoo -= 2;
            petLimpo = true;
            System.out.println("Banho concluido com sucesso! O pet esta limpo!");
        } else {
            System.out.println("Recursos insuficientes! Necessario 10L de agua e 2L de shampoo.");
        }
    }

    public void retirarPet() {
        if (!temPet) {
            System.out.println("Nao ha nenhum pet para retirar da maquina!");
            return;
        }

        if (!petLimpo) {
            maquinaSuja = true;
            System.out.println("O pet foi retirado SEM estar limpo! A maquina ficou contaminada/suja.");
        } else {
            System.out.println("Pet limpo retirado com sucesso! A maquina permanece limpa.");
        }

        temPet = false;
        petLimpo = false;
    }

    public void limparMaquina() {
        if (!maquinaSuja) {
            System.out.println("A maquina ja esta limpa, nao precisa de higienizacao.");
            return;
        }

        if (agua >= 3 && shampoo >= 1) {
            agua -= 3;
            shampoo -= 1;
            maquinaSuja = false;
            System.out.println("Higienizacao concluida! A maquina esta liberada para o proximo pet.");
        } else {
            System.out.println("Recursos insuficientes para limpar! Necessario 3L de agua e 1L de shampoo.");
        }
    }

    public void status() {
        System.out.println("\n--- PAINEL DA MÁQUINA DE BANHO ---");
        System.out.println("Agua: " + agua + "/30L");
        System.out.println("Shampoo: " + shampoo + "/10L");
        System.out.println("Ocupacao: " + (temPet ? (petLimpo ? "Pet presente (Limpo)" : "Pet presente (Sujo)") : "Vazia"));
        System.out.println("Condicao da maquina: " + (maquinaSuja ? "SUJA (Higienizacao obrigatoria)" : "LIMPA"));
        System.out.println("----------------------------------");
    }
}

public class ExercicioPetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();

        int opcao = -1;

        while (opcao != 0) {
            maquina.status();
            System.out.println("1 - Colocar pet na maquina");
            System.out.println("2 - Dar banho no pet");
            System.out.println("3 - Retirar pet da maquina");
            System.out.println("4 - Abastecer agua (+2L)");
            System.out.println("5 - Abastecer shampoo (+2L)");
            System.out.println("6 - Limpar maquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma operacao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> maquina.colocarPet();
                case 2 -> maquina.darBanho();
                case 3 -> maquina.retirarPet();
                case 4 -> maquina.abastecerAgua();
                case 5 -> maquina.abastecerShampoo();
                case 6 -> maquina.limparMaquina();
                case 0 -> System.out.println("Sistema do Pet Shop finalizado.");
                default -> System.out.println("Opcao invalida!");
            }
        }

        scanner.close();
    }
}