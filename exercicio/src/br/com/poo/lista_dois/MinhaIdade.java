package br.com.poo.lista_dois;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MinhaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data de nascimento
        System.out.println("Digite o ano de nascimento:");
        int ano = scanner.nextInt();

        System.out.println("Digite o mês de nascimento:");
        int mes = scanner.nextInt();

        System.out.println("Digite o dia de nascimento:");
        int dia = scanner.nextInt();

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        // Data de nascimento
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        // Calcula a idade
        int idade = Period.between(dataNascimento, dataAtual).getYears();

        // Exibe a idade
        System.out.println("Você tem " + idade + " anos.");

        scanner.close();
    }
}
