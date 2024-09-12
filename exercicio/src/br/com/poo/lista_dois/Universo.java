package br.com.poo.lista_dois;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Universo {

    private static final Logger logger = Logger.getLogger(Universo.class.getName());
    private static int numeroUniverso = 0;
    private static int tentativas = 3;
    private static Scanner scanner = new Scanner(System.in);

    static {
        // Configura o logger para mostrar apenas as mensagens
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter() {
            @Override
            public String format(java.util.logging.LogRecord record) {
                return record.getMessage() + System.lineSeparator();
            }
        });
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL); // Certifique-se de que o nível está configurado para mostrar todas as mensagens

        // Remove os handlers padrão para não exibir data e hora
        for (java.util.logging.Handler handler : Logger.getLogger("").getHandlers()) {
            Logger.getLogger("").removeHandler(handler);
        }
    }

    public static void main(String[] args) {
        while (tentativas > 0) {
            pergunta();
            if (verificaCaracter()) {
                if (numeroUniverso == 42) {
                    logger.info("Correto! O número do universo é realmente 42.");
                    break;
                } else {
                    tentativas--;
                    logger.info("Errado! Tentativas restantes: " + tentativas);
                }
            } else {
                logger.info("Caracter inválido, tente novamente.");
            }

            if (tentativas == 0) {
                logger.info("Estourou o número de tentativas! Leia o Guia do Mochileiro das Galáxias.");
            }
        }
    }

    public static void pergunta() {
        logger.info("Qual é o número que você acha que é a resposta para a pergunta fundamental sobre a vida, o universo e tudo mais?");
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
