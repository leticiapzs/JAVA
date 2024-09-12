package br.com.poo.lista_dois;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Converter {
    private static final Logger logger = Logger.getLogger(Converter.class.getName());

    public static void main(String[] args) {
        // Configura o Logger
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // Define um formatter personalizado para remover o INFO e a data/hora
        consoleHandler.setFormatter(new SimpleFormatter() {
            @Override
            public String format(java.util.logging.LogRecord record) {
                return record.getMessage() + "\n";
            }
        });
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL); // Configura o nível de log para ALL para garantir que todas as mensagens sejam exibidas

        Scanner scanner = new Scanner(System.in);

        // Solicita o valor de horas (real)
        logger.info("Digite o valor de horas (ex: 2.5 para 2 horas e 30 minutos):");
        double horas = scanner.nextDouble();

        // Passo 1: Converte horas para minutos
        double minutos = horas * 60;
        logger.log(Level.INFO, "Passo 1: {0} horas equivalem a {1} minutos.", new Object[]{horas, minutos});

        // Passo 2: Converte minutos para segundos
        double segundos = minutos * 60;
        logger.log(Level.INFO, "Passo 2: {0} minutos equivalem a {1} segundos.", new Object[]{minutos, segundos});

        // Exibe o resultado final
        logger.log(Level.INFO, "Resultado: {0} horas equivalem a {1} segundos.", new Object[]{horas, segundos});

        scanner.close();
    }
}
