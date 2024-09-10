package br.com.poo.lista_dois;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de horas (real)
        System.out.println("Digite o valor de horas (ex: 2.5 para 2 horas e 30 minutos):");
        double horas = scanner.nextDouble();

        // Passo 1: Converte horas para minutos
        double minutos = horas * 60;
        System.out.println("Passo 1: " + horas + " horas equivalem a " + minutos + " minutos.");

        // Passo 2: Converte minutos para segundos
        double segundos = minutos * 60;
        System.out.println("Passo 2: " + minutos + " minutos equivalem a " + segundos + " segundos.");

        // Exibe o resultado final
        System.out.println("Resultado: " + horas + " horas equivalem a " + segundos + " segundos.");

        scanner.close();
    }
}
