package br.com.poo.lista_dois;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário o intervalo
        System.out.println("Digite o valor inicial do intervalo (maior que 100):");
        int inicio = scanner.nextInt();

        System.out.println("Digite o valor final do intervalo:");
        int fim = scanner.nextInt();

        // Verificar se o intervalo é válido
        if (inicio <= 100 || fim <= 100 || inicio >= fim) {
            System.out.println("Intervalo inválido. O valor inicial e final devem ser maiores que 100, e o valor inicial deve ser menor que o valor final.");
            return;
        }

        // Encontrar os múltiplos de 6 no intervalo
        ArrayList<Integer> multiplosDe6 = new ArrayList<>();
        for (int i = inicio; i <= fim; i++) {
            if (i % 6 == 0) {
                multiplosDe6.add(i);
            }
        }

        // Verificar se há múltiplos suficientes
        if (multiplosDe6.size() < 6) {
            System.out.println("Não há múltiplos de 6 suficientes no intervalo.");
            return;
        }

        // Somar os três primeiros e os três últimos múltiplos de 6
        int soma = 0;
        System.out.println("Os três primeiros múltiplos de 6:");
        for (int i = 0; i < 3; i++) {
            System.out.println(multiplosDe6.get(i));
            soma += multiplosDe6.get(i);
        }

        System.out.println("Os três últimos múltiplos de 6:");
        for (int i = multiplosDe6.size() - 3; i < multiplosDe6.size(); i++) {
            System.out.println(multiplosDe6.get(i));
            soma += multiplosDe6.get(i);
        }

        // Exibir o resultado da soma
        System.out.println("A soma dos três primeiros e três últimos múltiplos de 6 é: " + soma);
    }
}
