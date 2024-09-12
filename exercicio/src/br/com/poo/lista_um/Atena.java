package br.com.poo.lista_um;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Atena {

    public static void main(String[] args) {
        
        // Configuração do Logger
        Logger logger = Logger.getLogger(Atena.class.getName());
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
        
        // Cria um objeto Scanner para ler entradas do usuário 
        Scanner sc = new Scanner(System.in);
    
        // Solicita ao usuário a entrada 
        logger.info("Insira a temperatura em Celsius: ");
        double temperaturaEmCelsius = sc.nextDouble();
        
        // Conversão de Celsius para Fahrenheit
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8 + 32);
        
        // Exibe a conversão, usando String.format para formatar a mensagem
        logger.info(String.format("A temperatura %.2f°C é equivalente a %.2f°F", temperaturaEmCelsius, temperaturaEmFahrenheit));
        
        // Encerramento do Scanner
        sc.close();
    }
}
