package br.com.poo.lista_um;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Hera {

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
		 
	// Cria um objeto Scanner para ler entradas do usuário
		 Scanner sc = new Scanner(System.in);

	// Declaração das variáveis para armazenar as idades
		 int idadeColega1, idadeColega2, idadeColega3, idadeColega4, idadeColega5, minha_idade;
		 int soma;

   // Solicita e lê a idade do colega 1
		 logger.info("Qual é a idade do colega 1?\n");
		 idadeColega1 = sc.nextInt();

	// Solicita e lê a idade do colega 2
		 logger.info("Qual é a idade do colega 2?\n");
		 idadeColega2 = sc.nextInt();

	// Solicita e lê a idade do colega 3
		 logger.info("Qual é a idade do colega 3?\n");
		 idadeColega3 = sc.nextInt();
	// Solicita e lê a idade do colega 4
		 logger.info("Qual é a idade do colega 4?\n");
		 idadeColega4 = sc.nextInt();

	// Solicita e lê a idade do colega 5
		 logger.info("Qual é a idade do colega 5?\n");
		 idadeColega5 = sc.nextInt();
	// Solicita e lê a sua própria idade
		 logger.info("Qual é a sua idade?\n");
		 minha_idade = sc.nextInt();

	// Calcula a soma das idades
		 soma = idadeColega1 + idadeColega2 + idadeColega3 + idadeColega4 + idadeColega5 + minha_idade;

	// Exibe o resultado
		 logger.info("O tempo de vida meu e dos meus colegas é: " + soma);

	// Fecha o scanner
		 sc.close();
	    }
	}