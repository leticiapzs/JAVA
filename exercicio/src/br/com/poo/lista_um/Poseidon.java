package br.com.poo.lista_um;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Poseidon {

    public static void main(String[] args) {
        
        // Configuração do Logger
        Logger logger = Logger.getLogger(Poseidon.class.getName());
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

        // Prepara a entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // Declaração de variáveis
        String nome;
        String sobrenome;
        
        // Mensagem inicial
        logger.info("Olá!");
        
        // Exibe a mensagem e pede ao usuário escrever o seu nome
        logger.info("Qual é o seu nome? ");
        nome = sc.nextLine();
        
        // Exibe a mensagem e pede ao usuário para escrever o sobrenome
        logger.info("Qual é o seu sobrenome? ");
        sobrenome = sc.nextLine();
        
        // Exibe o nome e o sobrenome
        logger.info("Olá " + nome + " " + sobrenome + ". Seja bem-vindo(a) ao programa Poseidon!");
        
        // Fecha o scanner
        sc.close();
    }
}
