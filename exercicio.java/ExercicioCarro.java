/*

Exercício 12
CONTROLE DE FUNÇÕES DE UM CARRO E CÂMBIO DE MARCHAS

Considere: 
Parte A - Modelar as operações de um carro (ligar, desligar, acelerar, diminuir velocidade, virar e trocar marchas).
Parte B - Aplicar regras de segurança física e mecânica (não acelerar desligado ou em ponto morto, não pular marchas e respeitar limites de velocidade por marcha).
Parte C - Criar um menu interativo com painel de instrumentos que permite pilotar o carro até o usuário decidir sair.

REGRAS DO EXERCÍCIO:
// O carro inicia desligado, em ponto morto (marcha 0) e com velocidade em 0 km/h.
// O carro desligado não pode realizar nenhuma função.
// Só pode ser desligado se estiver em ponto morto (0) e velocidade em 0 km/h.
// Acelerar incrementa 1 km/h (máx 120 km/h) e diminuir decrementa 1 km/h (mín 0 km/h).
// Possui 6 marchas e não é permitido pular marchas (usar Math.abs para validar troca de 1 em 1).
// Em ponto morto (marcha 0) não acelera.
// Limites de velocidade por marcha:
// 1ª marcha: 0 a 20 km/h
// 2ª marcha: 21 a 40 km/h
// 3ª marcha: 41 a 60 km/h
// 4ª marcha: 61 a 80 km/h
// 5ª marcha: 81 a 100 km/h
// 6ª marcha: 101 a 120 km/h
// Só pode virar para esquerda/direita se a velocidade estiver entre 1 km/h e 40 km/h.
*/


import java.util.Scanner;

class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro ja esta ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado!");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro ja esta desligado.");
            return;
        }
        if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado com sucesso!");
        } else {
            System.out.println("Nao pode desligar! O carro deve estar em ponto morto (0) e parado (0 km/h).");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("Carro desligado nao acelera!");
            return;
        }
        if (marcha == 0) {
            System.out.println("Carro em ponto morto nao acelera!");
            return;
        }
        if (velocidade >= 120) {
            System.out.println("Velocidade maxima atingida (120 km/h)!");
            return;
        }

        int maxPermitido = switch (marcha) {
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };

        if (velocidade + 1 > maxPermitido) {
            System.out.println("Limite da " + marcha + "a marcha atingido (" + maxPermitido + " km/h). Troque de marcha!");
        } else {
            velocidade++;
            System.out.println("Acelerou! Velocidade: " + velocidade + " km/h");
        }
    }

    public void desacelerar() {
        if (!ligado) {
            System.out.println("Carro desligado!");
            return;
        }
        if (velocidade <= 0) {
            System.out.println("O carro ja esta parado (0 km/h)!");
            return;
        }

        int minPermitido = switch (marcha) {
            case 1 -> 0;
            case 2 -> 21;
            case 3 -> 41;
            case 4 -> 61;
            case 5 -> 81;
            case 6 -> 101;
            default -> 0;
        };

        if (velocidade - 1 < minPermitido && marcha > 1) {
            System.out.println("Velocidade muito baixa para a " + marcha + "a marcha. Reduza a marcha primeiro!");
        } else {
            velocidade--;
            System.out.println("Desacelerou! Velocidade: " + velocidade + " km/h");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("Carro desligado!");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inexistente (0 a 6).");
            return;
        }
        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Nao pode pular marcha! Marcha atual: " + marcha);
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha alterada para: " + (marcha == 0 ? "Ponto Morto" : marcha + "a marcha"));
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("Carro desligado!");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virou para a " + direcao + "!");
        } else {
            System.out.println("Nao pode virar! A velocidade deve estar entre 1 e 40 km/h.");
        }
    }

    public void status() {
        System.out.println("Status: " + (ligado ? "LIGADO" : "DESLIGADO") + " | Marcha: " + marcha + " | Velocidade: " + velocidade + " km/h");
    }
}

public class ExercicioCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== PAINEL DO CARRO =====");
            carro.status();
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar (+1 km/h)");
            System.out.println("4 - Desacelerar (-1 km/h)");
            System.out.println("5 - Trocar marcha");
            System.out.println("6 - Virar para Esquerda");
            System.out.println("7 - Virar para Direita");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.desacelerar();
                case 5 -> {
                    System.out.print("Informe a marcha (0 a 6): ");
                    carro.trocarMarcha(scanner.nextInt());
                }
                case 6 -> carro.virar("Esquerda");
                case 7 -> carro.virar("Direita");
                case 0 -> System.out.println("Saindo do simulador de carro.");
                default -> System.out.println("Opcao invalida!");
            }
        }
        scanner.close();
    }
}