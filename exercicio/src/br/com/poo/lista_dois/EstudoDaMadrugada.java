package br.com.poo.lista_dois;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EstudoDaMadrugada {
    private static final Logger logger = Logger.getLogger(EstudoDaMadrugada.class.getName());

    static {
        // Configura o Logger
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // Define um formatter personalizado para remover o INFO e a data/hora
        consoleHandler.setFormatter(new SimpleFormatter() {
            @Override
            public String format(java.util.logging.LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL); // Configura o nível de log para ALL para garantir que todas as mensagens sejam exibidas

        // Remove os handlers padrão para não exibir data e hora
        for (java.util.logging.Handler handler : Logger.getLogger("").getHandlers()) {
            Logger.getLogger("").removeHandler(handler);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao assistente quantos estudantes há na turma
        logger.info("Quantos estudantes têm na turma?");
        int numEstudantes = scanner.nextInt();

        // Percentuais fornecidos pelo assistente
        double percentualDisciplina1 = 35.0; // 35% na primeira disciplina
        double percentualDisciplina2 = 30.0; // 30% na segunda disciplina

        // Calcula a média dos percentuais
        double mediaPercentual = (percentualDisciplina1 + percentualDisciplina2) / 2.0;

        // Calcula a quantidade de estudantes que estudam de madrugada
        double estudantesMadrugada = (mediaPercentual / 100) * numEstudantes;

        // Exibe o resultado para o assistente
        logger.info("Em média, " + (int) estudantesMadrugada + " estudantes estudam de madrugada nas duas primeiras disciplinas.");

        scanner.close();
    }
}
