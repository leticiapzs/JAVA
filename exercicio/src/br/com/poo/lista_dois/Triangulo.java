package br.com.poo.lista_dois;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Triangulo {
    private static final Logger logger = Logger.getLogger(Triangulo.class.getName());

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
        Scanner scanner = new Scanner(System.in);

        // Solicita os ângulos do triângulo
        logger.info("Digite o primeiro ângulo:");
        int angulo1 = scanner.nextInt();

        logger.info("Digite o segundo ângulo:");
        int angulo2 = scanner.nextInt();

        logger.info("Digite o terceiro ângulo:");
        int angulo3 = scanner.nextInt();

        // Verifica se os ângulos formam um triângulo válido (soma dos ângulos = 180)
        if (angulo1 + angulo2 + angulo3 == 180) {
            // Classificação do triângulo pelos ângulos
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                logger.info("O triângulo é Retângulo.");
            } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                logger.info("O triângulo é Obtusângulo.");
            } else {
                logger.info("O triângulo é Acutângulo.");
            }
        } else {
            logger.info("Os ângulos não formam um triângulo válido.");
        }

        // Exibe os ângulos fornecidos
        logger.info("Ângulos: " + angulo1 + ", " + angulo2 + ", " + angulo3);

        scanner.close();
    }
}
