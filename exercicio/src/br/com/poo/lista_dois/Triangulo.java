package br.com.poo.lista_dois;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os ângulos do triângulo
        System.out.println("Digite o primeiro ângulo:");
        int angulo1 = scanner.nextInt();

        System.out.println("Digite o segundo ângulo:");
        int angulo2 = scanner.nextInt();

        System.out.println("Digite o terceiro ângulo:");
        int angulo3 = scanner.nextInt();

        // Verifica se os ângulos formam um triângulo válido (soma dos ângulos = 180)
        if (angulo1 + angulo2 + angulo3 == 180) {
            // Classificação do triângulo pelos ângulos
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("O triângulo é Retângulo.");
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                System.out.println("O triângulo é Obtusângulo.");
            } else {
                System.out.println("O triângulo é Acutângulo.");
            }
        } else {
            System.out.println("Os ângulos não formam um triângulo válido.");
        }

        // Exibe os ângulos fornecidos
        System.out.println("Ângulos: " + angulo1 + ", " + angulo2 + ", " + angulo3);

        scanner.close();
    }
}