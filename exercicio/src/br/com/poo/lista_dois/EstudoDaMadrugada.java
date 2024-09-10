package br.com.poo.lista_dois;

import java.util.Scanner;

public class EstudoDaMadrugada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao assistente quantos estudantes há na turma
        System.out.println("Quantos estudantes têm na turma?");
        int numEstudantes = scanner.nextInt();

        // Percentuais fornecidos pelo assistente
        double percentualDisciplina1 = 35.0; // 35% na primeira disciplina
        double percentualDisciplina2 = 30.0; // 30% na segunda disciplina

        // Calcula a média dos percentuais
        double mediaPercentual = (percentualDisciplina1 + percentualDisciplina2) / 2.0;

        // Calcula a quantidade de estudantes que estudam de madrugada
        double estudantesMadrugada = (mediaPercentual / 100) * numEstudantes;

        // Exibe o resultado para o assistente
        System.out.println("Em média, " + (int) estudantesMadrugada + " estudantes estudam de madrugada nas duas primeiras disciplinas.");
    }
}
