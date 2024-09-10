package br.com.poo.lista_dois;
import java.util.Scanner;

public class Universo {

	private static int numeroUniverso = 0;
    private static int tentativas = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (tentativas > 0) {
            pergunta();
            if (verificaCaracter()) {
                if (numeroUniverso == 42) {
                    System.out.println("Correto! O número do universo é realmente 42.");
                    break;
                } else {
                    tentativas--;
                    System.out.println("Errado! Tentativas restantes: " + tentativas);
                }
            } else {
                System.out.println("Caracter inválido, tente novamente.");
            }

            if (tentativas == 0) {
                System.out.println("Estourou o número de tentativas! Leia o Guia do Mochileiro das Galáxias.");
            }
        }
    }

    public static void pergunta() {
        System.out.println("Qual é o número que você acha que é a resposta para a pergunta fundamental sobre a vida, o universo e tudo mais?");
        String cadNumero = scanner.nextLine();
        try {
            numeroUniverso = Integer.parseInt(cadNumero);
        } catch (NumberFormatException e) {
            numeroUniverso = -1; // Valor inválido
        }
    }

    public static boolean verificaCaracter() {
        return numeroUniverso >= 0; // Se for negativo, é inválido
    }
}