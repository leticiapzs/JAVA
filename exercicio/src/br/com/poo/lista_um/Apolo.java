package br.com.poo.lista_um;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class Apolo {

	public static void main(String[] args) {
		
		 // Configuração do Logger
        Logger logger = Logger.getLogger(Hera.class.getName());
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
		
		//Expressão A
		int resultadoA = (2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66);
		
		//Exibe o resultado
		logger.info("O resultado da expressão A é: " + resultadoA);
		
		//Expressão B
		int resultadoB =(2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9);
		
		//Exibe o resultado
		logger.info("O resultado da expressão B é: " + resultadoB);
		
		

	}

}
