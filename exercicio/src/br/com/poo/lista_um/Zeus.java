package br.com.poo.lista_um;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Zeus {
    private static final Logger logger = Logger.getLogger(Zeus.class.getName());

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

        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;

        // Leitura e validação dos números
        while (!validInput) {
            try {
                logger.info("Número 1: ");
                num1 = scanner.nextInt();

                logger.info("Número 2: ");
                num2 = scanner.nextInt();

                validInput = true; // Input válido, sair do loop
            } catch (InputMismatchException e) {
                logger.info("Entrada inválida. Por favor, insira números inteiros.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        // Operações e tratamento de exceções
        try {
            int soma = num1 + num2;
            int subtracao = num1 - num2;
            int multiplicacao = num1 * num2;
            double divisao = (num2 != 0) ? (double) num1 / num2 : Double.NaN; // Divisão por zero

            logger.info("Soma: " + soma);
            logger.info("Subtração: " + subtracao);
            logger.info("Multiplicação: " + multiplicacao);

            if (Double.isNaN(divisao)) {
                logger.info("Divisão: Não é possível dividir por zero.");
            } else {
                logger.info("Divisão: " + divisao);
            }
        } catch (ArithmeticException e) {
            logger.info("Erro de operação: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

