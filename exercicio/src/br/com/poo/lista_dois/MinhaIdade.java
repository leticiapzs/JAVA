package br.com.poo.lista_dois;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import br.com.poo.lista_um.Poseidon;

public class MinhaIdade {
    public static void main(String[] args) {
    	
    	 // Configuração do Logger
        Logger logger = Logger.getLogger(MinhaIdade.class.getName());
        // Remove os handlers padrões (para remover a saída com data e INFO)
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

        // Cria um novo ConsoleHandler com um Formatter personalizado
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getMessage() + "\n"; // Apenas exibe a mensagem
            }
        });
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false); // Não usa o Formatter padrão

    	
        Scanner scanner = new Scanner(System.in);

        // Solicita a data de nascimento
        logger.info("Digite o ano de nascimento:");
        int ano = scanner.nextInt();

        logger.info("Digite o mês de nascimento:");
        int mes = scanner.nextInt();

        logger.info("Digite o dia de nascimento:");
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
